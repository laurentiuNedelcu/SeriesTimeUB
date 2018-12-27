package model;

import vista.ObserverLlistas;

public interface SubjectLlistas {
    void registerObserverLlistas(ObserverLlistas o);
    void removeObserverLlistas(ObserverLlistas o);
    void notifyObserversLlistas();
}
