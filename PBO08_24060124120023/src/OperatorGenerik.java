public class OperatorGenerik {
    // Prosedur Generik Tukar untuk menukar dua nilai parameter
    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public <T extends Kucing> double Bobot2(T kucing1, T kucing2) {
        return kucing1.getBobot() + kucing2.getBobot();
    }
}