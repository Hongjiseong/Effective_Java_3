package effective.design.pattern.builder;

public class BuilderModel {
    private final int id;
    private final int name;
    private String email = "";
    private String phone = "";

    public static class Builder {
        private final int id;
        private final int name;

        private String email = "";
        private String phone = "";

        public Builder(int id, int name){
            this.id = id;
            this.name = name;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public BuilderModel build(Builder builder){
            return new BuilderModel(this);
        }
    }

    private BuilderModel(Builder builder){
        id = builder.id;
        name = builder.name;
        email = builder.email;
        phone = builder.phone;
    }
}
