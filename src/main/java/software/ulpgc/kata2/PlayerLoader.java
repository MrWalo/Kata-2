package software.ulpgc.kata2;

import java.io.IOException;
import java.util.List;

public interface PlayerLoader {
    List<Player> load() throws IOException;
}
