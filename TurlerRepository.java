import java.util.ArrayList;
import java.util.List;

public class TurlerRepository implements IRepository<Turler>{
    private List<Turler>_turlerList=new ArrayList<>();

    @Override
    public void add(Turler entity) {

    }

    @Override
    public void delete(Turler entity) {

    }

    @Override
    public List list() {
        return _turlerList;
    }
}
