package org.example;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

class CrptApi implements CreationOfADocumentForPuttingIntoCirculationGoodsProducedInTheRF {

    private final TimeUnit timeUnit;
    private final int requestLimit;

    CrptApi(TimeUnit timeUnit, int requestLimit) {
        this.timeUnit = timeUnit;
        this.requestLimit = requestLimit;
    }

    @Override
    public void createADocumentForPuttingIntoCirculationGoodsProducedInTheRF(Document document, String signature) {

    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public int getRequestLimit() {
        return requestLimit;
    }
}

class Document {
    public Description description;
    public String doc_id;
    public String doc_status;
    public String doc_type;
    public boolean importRequest;
    public String owner_inn;
    public String participant_inn;
    public String producer_inn;
    public String production_date;
    public String production_type;
    public ArrayList<Product> products;
    public String reg_date;
    public String reg_number;
}

class Description{
    public String participantInn;
}

class Product{
    public String certificate_document;
    public String certificate_document_date;
    public String certificate_document_number;
    public String owner_inn;
    public String producer_inn;
    public String production_date;
    public String tnved_code;
    public String uit_code;
    public String uitu_code;
}

interface CreationOfADocumentForPuttingIntoCirculationGoodsProducedInTheRF {
    void createADocumentForPuttingIntoCirculationGoodsProducedInTheRF(Document document, String signature);
}
