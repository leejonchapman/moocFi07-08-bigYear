public class Bird {
    String engName;
    String latName;
    int observations;

    public Bird(String engName, String latName) {
        this.engName = engName;
        this.latName = latName;
        this.observations = 0;
    }

    public String getEngName() {
        return engName;
    }

    public String getLatName() {
        return latName;
    }

    public int getObservations() {
        return observations;
    }

    @Override
    public String toString() {
        return this.engName + " (" + this.latName + "): " + this.observations + " observations";
    }
}
