package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.UploadedFile;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelUploadedFileConnection {
    private final List<UploadedFile> items;
    private final String nextToken;

    public interface BuildStep {
        ModelUploadedFileConnection build();

        BuildStep items(List<UploadedFile> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<UploadedFile> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelUploadedFileConnection.BuildStep
        public ModelUploadedFileConnection build() {
            return new ModelUploadedFileConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelUploadedFileConnection.BuildStep
        public BuildStep items(List<UploadedFile> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelUploadedFileConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelUploadedFileConnection.Builder, ai.salesmax.services.model.ModelUploadedFileConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<UploadedFile>) list);
        }

        private CopyOfBuilder(List<UploadedFile> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelUploadedFileConnection.Builder, ai.salesmax.services.model.ModelUploadedFileConnection.BuildStep
        public CopyOfBuilder items(List<UploadedFile> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelUploadedFileConnection.Builder, ai.salesmax.services.model.ModelUploadedFileConnection.BuildStep
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
        if (obj == null || ModelUploadedFileConnection.class != obj.getClass()) {
            return false;
        }
        ModelUploadedFileConnection modelUploadedFileConnection = (ModelUploadedFileConnection) obj;
        return s6c.m47909a(getItems(), modelUploadedFileConnection.getItems()) && s6c.m47909a(getNextToken(), modelUploadedFileConnection.getNextToken());
    }

    public List<UploadedFile> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelUploadedFileConnection(List<UploadedFile> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
