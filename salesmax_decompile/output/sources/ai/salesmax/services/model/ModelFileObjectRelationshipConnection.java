package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.fileObjectRelationship;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public class ModelFileObjectRelationshipConnection {
    private final List<fileObjectRelationship> items;
    private final String nextToken;

    public interface BuildStep {
        ModelFileObjectRelationshipConnection build();

        BuildStep items(List<fileObjectRelationship> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<fileObjectRelationship> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelFileObjectRelationshipConnection.BuildStep
        public ModelFileObjectRelationshipConnection build() {
            return new ModelFileObjectRelationshipConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelFileObjectRelationshipConnection.BuildStep
        public BuildStep items(List<fileObjectRelationship> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelFileObjectRelationshipConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelFileObjectRelationshipConnection.Builder, ai.salesmax.services.model.ModelFileObjectRelationshipConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<fileObjectRelationship>) list);
        }

        private CopyOfBuilder(List<fileObjectRelationship> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelFileObjectRelationshipConnection.Builder, ai.salesmax.services.model.ModelFileObjectRelationshipConnection.BuildStep
        public CopyOfBuilder items(List<fileObjectRelationship> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelFileObjectRelationshipConnection.Builder, ai.salesmax.services.model.ModelFileObjectRelationshipConnection.BuildStep
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelFileObjectRelationshipConnection modelFileObjectRelationshipConnection = (ModelFileObjectRelationshipConnection) obj;
        return s6c.m47909a(getItems(), modelFileObjectRelationshipConnection.getItems()) && s6c.m47909a(getNextToken(), modelFileObjectRelationshipConnection.getNextToken());
    }

    public List<fileObjectRelationship> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelFileObjectRelationshipConnection(List<fileObjectRelationship> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
