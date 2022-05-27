package seven.T1.Models.Service;

import seven.T1.Models.Entity.UserEntity;
import seven.T1.Models.Repository.UserRepository;

import java.util.List;

public class UserService {
    private UserService () {
    }

    private static UserService personServ = new UserService ();

    public static UserService getInstance () {
        return personServ;
    }

    public void edit (UserEn personEnti) throws Exception{
        try (UserRepo personRepo=new UserRepo ()){
//            personEnti.setSalary (personEnti.getSalary ()-(personEnti.getSalary ()*10/100));
            personRepo.update (personEnti);
            personRepo.commit ();
        }
    }
//    public void remove(Long id) throws Exception{
//        try (UserRepo personRepo=new UserRepo ()){
//            personRepo.delete(id);
//            personRepo.commit ();
//        }
//    }
    public List<UserEn> report() throws Exception{
        List<UserEn> personEntis;
        try (UserRepo personRepo=new UserRepo ()){
            personEntis=personRepo.select ();
        }
        return personEntis;
    }

}
