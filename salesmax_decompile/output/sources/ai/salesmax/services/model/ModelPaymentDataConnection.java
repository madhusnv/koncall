package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.PaymentData;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelPaymentDataConnection {
    private final List<PaymentData> items;
    private final String nextToken;

    public interface BuildStep {
        ModelPaymentDataConnection build();

        BuildStep items(List<PaymentData> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<PaymentData> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelPaymentDataConnection.BuildStep
        public ModelPaymentDataConnection build() {
            return new ModelPaymentDataConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelPaymentDataConnection.BuildStep
        public BuildStep items(List<PaymentData> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelPaymentDataConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelPaymentDataConnection.Builder, ai.salesmax.services.model.ModelPaymentDataConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<PaymentData>) list);
        }

        private CopyOfBuilder(List<PaymentData> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelPaymentDataConnection.Builder, ai.salesmax.services.model.ModelPaymentDataConnection.BuildStep
        public CopyOfBuilder items(List<PaymentData> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelPaymentDataConnection.Builder, ai.salesmax.services.model.ModelPaymentDataConnection.BuildStep
        public CopyOfBuilder nextToken(String str) {
            return (CopyOfBuilder) super.nextToken(str);
        }
    }

    public static BuildStep builder() {
        return new Builder();
    }

    public CopyOfBuilder copyOfBuilder() {
        return new CopyOfBuilder(this.items, this.nextToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelPaymentDataConnection.class != obj.getClass()) {
            return false;
        }
        ModelPaymentDataConnection modelPaymentDataConnection = (ModelPaymentDataConnection) obj;
        return s6c.m47909a(getItems(), modelPaymentDataConnection.getItems()) && s6c.m47909a(getNextToken(), modelPaymentDataConnection.getNextToken());
    }

    public List<PaymentData> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelPaymentDataConnection(List<PaymentData> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
