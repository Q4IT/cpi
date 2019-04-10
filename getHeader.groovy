import com.sap.it.api.mapping.*;
import com.sap.it.api.mapping.MappingContext;

def String getheader(String header_name, MappingContext context) {
    def headervalue= context.getHeader(header_name);
    return headervalue;
}