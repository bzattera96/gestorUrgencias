package util;

import domain.Urgencia;

import java.util.Comparator;

public class TriageComparator implements Comparator<Urgencia> {
    @Override
    public int compare(Urgencia o1, Urgencia o2) {
        int comparatorResult = 0;
        if (o1.getTriage().getPrioridad() > o2.getTriage().getPrioridad()) {
            comparatorResult = 1;
        } else if (o2.getTriage().getPrioridad() > o1.getTriage().getPrioridad()) {
            comparatorResult = -1;
        }
        return comparatorResult;
    }
}