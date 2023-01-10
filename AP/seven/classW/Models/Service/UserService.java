package seven.classW.Models.Service;

import seven.classW.Models.Entity.UserEntity;
import seven.classW.Models.Repository.UserRepository;

import java.util.List;
public class UserService {
    private UserService () {
    }

    private static UserService personServ = new UserService();

    public static UserService getInstance () {
        return personServ;
    }

    public void save (UserEntity personEnti) throws Exception {
        try (UserRepository personRepo = new UserRepository()) {
//            personEnti.setSalary (personEnti.getSalary () - (personEnti.getSalary () * 10 / 100));
            personRepo.insert (personEnti);
            personRepo.commit ();
        }
    }
    public void edit (UserEntity personEnti) throws Exception{
        try (UserRepository personRepo=new UserRepository ()){
//            personEnti.setSalary (personEnti.getSalary ()-(personEnti.getSalary ()*10/100));
            personRepo.update (personEnti);
            personRepo.commit ();
        }
    }
    public void remove(Long id) throws Exception{
        try (UserRepository personRepo=new UserRepository ()){
            personRepo.delete(id);
            personRepo.commit ();
        }
    }
    public List<UserEntity> report() throws Exception{
        List<UserEntity> personEntis;
        try (UserRepository personRepo=new UserRepository ()){
            personEntis=personRepo.select ();
        }
        return personEntis;
    }

}
