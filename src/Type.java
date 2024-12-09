package src;

public abstract class Type {
    private String weaknesses;
    private String superEffective;
    private String type;

    public Type(String type, String superEffective, String weaknesses) {
        this.type = type;
        this.superEffective = superEffective;
        this.weaknesses = weaknesses;
    }

    public String getWeaknesses() {
        return weaknesses;
    }

    public String getSuperEffective() {
        return superEffective;
    }

    public String getType() {
        return type;
    }

    public void setWeaknesses(String weaknesses) {
        this.weaknesses = weaknesses;
    }

    public void setSuperEffective(String superEffective) {
        this.superEffective = superEffective;
    }

    public void setType(String type) {
        this.type = type;
    }
}