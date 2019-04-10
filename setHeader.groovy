import com.sap.it.api.mapping.*;
import com.sap.it.api.mapping.MappingContext;

def String setProperty(String property_name, String property_value, MappingContext context) {
    setProperty(property_name, property_value)
    return property_value 
} 
