package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.ChatMessage;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelChatMessageConnection {
    private final List<ChatMessage> items;
    private final String nextToken;

    public interface BuildStep {
        ModelChatMessageConnection build();

        BuildStep items(List<ChatMessage> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<ChatMessage> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelChatMessageConnection.BuildStep
        public ModelChatMessageConnection build() {
            return new ModelChatMessageConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelChatMessageConnection.BuildStep
        public BuildStep items(List<ChatMessage> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelChatMessageConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelChatMessageConnection.Builder, ai.salesmax.services.model.ModelChatMessageConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<ChatMessage>) list);
        }

        private CopyOfBuilder(List<ChatMessage> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelChatMessageConnection.Builder, ai.salesmax.services.model.ModelChatMessageConnection.BuildStep
        public CopyOfBuilder items(List<ChatMessage> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelChatMessageConnection.Builder, ai.salesmax.services.model.ModelChatMessageConnection.BuildStep
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
        if (obj == null || ModelChatMessageConnection.class != obj.getClass()) {
            return false;
        }
        ModelChatMessageConnection modelChatMessageConnection = (ModelChatMessageConnection) obj;
        return s6c.m47909a(getItems(), modelChatMessageConnection.getItems()) && s6c.m47909a(getNextToken(), modelChatMessageConnection.getNextToken());
    }

    public List<ChatMessage> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelChatMessageConnection(List<ChatMessage> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
