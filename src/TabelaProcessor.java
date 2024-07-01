import java.lang.reflect.Field;

public class TabelaProcessor {
    public static void processTabela(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = clazz.getAnnotation(Tabela.class);
            String tabelaName = tabelaAnnotation.value();

            System.out.println("Tabela name: " + tabelaName);

            for (Field field : clazz.getDeclaredFields()) {
                System.out.println("Field: " + field.getName());
            }
        }
    }
}
