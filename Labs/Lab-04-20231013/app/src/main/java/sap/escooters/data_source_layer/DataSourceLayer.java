package sap.escooters.data_source_layer;

import io.vertx.core.json.JsonObject;
import sap.layers.Layer;

public interface DataSourceLayer extends Layer {

    void saveUser(JsonObject user) throws DataSourceException;

    void saveEScooter(JsonObject scooter) throws DataSourceException;

    void saveRide(JsonObject ride) throws DataSourceException;
}
