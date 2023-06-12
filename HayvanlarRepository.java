import java.util.ArrayList;
import java.util.List;

public class HayvanlarRepository implements IRepository<Hayvanlar>{
    private List<Hayvanlar>_hayvanlarList=new ArrayList<>();
    @Override
    public void add(Hayvanlar entity) {
        if(entity!=null)
            _hayvanlarList.add(entity);
        else System.out.println("Ekleme başarısız.");

    }

    @Override
    public void delete(Hayvanlar entity) {
        if (entity!=null){
            _hayvanlarList.remove(entity);
            System.out.println("Silme başarılı");
        }

        else System.out.println("Silme başarısız");

    }

    @Override
    public List<Hayvanlar> list() {
        return _hayvanlarList;
    }
}
