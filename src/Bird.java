public class Bird {
    String engName;
    String latName;
    int observations;

    public Bird(String engName, String latName, int observations) {
        this.engName = engName;
        this.latName = latName;
        this.observations = observations;
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
        return "Birds{" +
                "engName='" + engName + '\'' +
                ", latName='" + latName + '\'' +
                ", observations=" + observations +
                '}';
    }
}
