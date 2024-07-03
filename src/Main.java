public class Main {
    public static void main(String[] args) {
        TabelaProcessor.processTabela(MyClass.class);
        Class<?> clazz = MyClass.class;
        readTabelaAnnotation(clazz);
    }

    public static void readTabelaAnnotation(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = clazz.getAnnotation(Tabela.class);
            String tabelaName = tabelaAnnotation.value();
            System.out.print("Tabela name: " + tabelaName);
        }
    }
}