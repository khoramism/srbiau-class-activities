package seven.T2.Models.Service;

import seven.T2.Models.Entity.UserEntity;
import seven.T2.Models.Repository.UserRepository;

import java.util.List;

public class CarService {
    private CarService () {
    }

    private static CarService CarService = new CarService();

    public static CarService getInstance () {
        return CarService;
    }


    public void edit (CarEntity carEn) throws Exception{
        try (CarRepository Carrepo=new CarRepository ()){
            Carrepo.update (carEn);
            Carrepo.commit ();
        }
    }
    public List<CarEntity> report() throws Exception{
        List<CarEntity> Caren;
        try (CarRepository carRepo=new CarRepository ()){
            Caren=carRepo.select ();
        }
        return Caren;
    }

}