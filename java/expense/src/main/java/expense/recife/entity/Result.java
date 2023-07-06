package expense.recife.entity;

import java.util.List;

public class Result {
    public boolean include_total;
    public String resource_id;
    public List<Field> fields;
    public String records_format;
    public List<Record> records;
    public Links _links;
    public int total;
}
