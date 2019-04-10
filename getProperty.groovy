import com.sap.it.api.mapping.*;
import com.sap.it.api.mapping.MappingContext;

def String getProperty(String property_name, MappingContext context) {
    def propValue= context.getPropery(property_name);
    return propValue;
}