package com.company;

import java.io.InputStream;
import java.util.List;

public interface ResourceReceiver {

    void setParser(Parser parser);

    void addResources(List<InputStream> resources);
}
