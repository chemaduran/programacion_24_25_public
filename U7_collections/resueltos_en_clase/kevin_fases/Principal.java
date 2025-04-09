package U7_collections.en_clase.kevin_fases;

import java.util.*;

public class Principal {
    public enum Fases {
        FASE_0,
        FASE_1,
        FASE_2,
        FASE_3
    }

    public static void main(String[] args) {
        Map<String, Fases> desescalada = new HashMap<>();

        desescalada.put("Territorio2", Fases.FASE_0);
        desescalada.put("Territorio3", Fases.FASE_0);
        desescalada.put("Territorio1", Fases.FASE_0);

        desescalada.put("Territorio9", Fases.FASE_2);
        desescalada.put("Territorio7", Fases.FASE_2);
        desescalada.put("Territorio8", Fases.FASE_2);

        desescalada.put("Territorio10", Fases.FASE_3);
        desescalada.put("Territorio11", Fases.FASE_3);
        desescalada.put("Territorio12", Fases.FASE_3);

        desescalada.put("Territorio5", Fases.FASE_1);
        desescalada.put("Territorio4", Fases.FASE_1);
        desescalada.put("Territorio6", Fases.FASE_1);

        for (Fases f : Fases.values()){
            List<String> territorios = new ArrayList<>();

            Iterator<Map.Entry<String, Fases>> iter = desescalada.entrySet().iterator();

            while (iter.hasNext()) {
                Map.Entry<String, Fases> entry = iter.next();
                if (entry.getValue() == f) {
                    territorios.add(entry.getKey());
                }
            }

            Collections.sort(territorios);
            System.out.println(" - Territorios de " + f + " ordenados alfabéticamente ");
            for (String t : territorios) {
                System.out.println(t);
            }
            territorios.clear();
            
        }



    }
}
