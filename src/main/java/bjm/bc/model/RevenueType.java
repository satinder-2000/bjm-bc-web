package bjm.bc.model;

public enum RevenueType {
	
	CORPORATION_TAXES("Corporation Taxes"),
    PROPERTY_TAXES("Property Taxes"),
    CAPITAL_TAXES("Capital Taxes"),
    OTHER_TAXES("Other Taxes"),
    INCOME_TAX("Income Tax"),
    NIC("National Insurance Contributions"),
    VAT("VAT"),
    GST("GST"),
    FUEL_DUTIES("Fuel Duties"),
    OTHER_INDIRECT_TAXES("Other Indirect Taxes");
    
    public final String label;
    
    private RevenueType(String label){
        this.label=label;
    }

    public String getLabel() {
        return label;
    }

}
