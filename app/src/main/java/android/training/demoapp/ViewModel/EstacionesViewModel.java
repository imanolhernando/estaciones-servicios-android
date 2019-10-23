package android.training.demoapp.ViewModel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import android.training.demoapp.Pojo.ListaEESSPrecio;
import android.training.demoapp.Repository.EstacionesRepository;

import java.util.List;

public class EstacionesViewModel extends AndroidViewModel {

    private EstacionesRepository er;

    public EstacionesViewModel(Application application) {
        super(application);
        er = new EstacionesRepository(application);
    }


    public void insert(ListaEESSPrecio estacion) {
        er.insert(estacion);
    }

    public LiveData<List<ListaEESSPrecio>> getAll() {
        return er.getAll();
    }

    public LiveData<List<ListaEESSPrecio>> getGasolinaMasBarata() {
        return er.getGasolinaMasBarata();
    }

    public LiveData<List<ListaEESSPrecio>> getDieselMasBarato() {
        return  er.getDieselMasBarato();
    }

    public LiveData<List<ListaEESSPrecio>> getPorPrecio(int combustible, int limit) {
        return er.getPorPrecio(combustible, limit);
    }
    public LiveData<List<ListaEESSPrecio>> getPorPrecio2(int combustible, int limit) {
        return er.getPorPrecio2(combustible, limit);
    }


    public LiveData<List<ListaEESSPrecio>> getCercanas(int limiteDistanciat) {
        return er.getCercanas(limiteDistanciat);
    }


    public void deleteAll() {
        er.deleteAll();
    }

}