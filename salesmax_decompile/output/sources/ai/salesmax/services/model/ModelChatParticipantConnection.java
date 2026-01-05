package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.ChatParticipant;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelChatParticipantConnection {
    private final List<ChatParticipant> items;
    private final String nextToken;

    public interface BuildStep {
        ModelChatParticipantConnection build();

        BuildStep items(List<ChatParticipant> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<ChatParticipant> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelChatParticipantConnection.BuildStep
        public ModelChatParticipantConnection build() {
            return new ModelChatParticipantConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelChatParticipantConnection.BuildStep
        public BuildStep items(List<ChatParticipant> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelChatParticipantConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelChatParticipantConnection.Builder, ai.salesmax.services.model.ModelChatParticipantConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<ChatParticipant>) list);
        }

        private CopyOfBuilder(List<ChatParticipant> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelChatParticipantConnection.Builder, ai.salesmax.services.model.ModelChatParticipantConnection.BuildStep
        public CopyOfBuilder items(List<ChatParticipant> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelChatParticipantConnection.Builder, ai.salesmax.services.model.ModelChatParticipantConnection.BuildStep
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
        if (obj == null || ModelChatParticipantConnection.class != obj.getClass()) {
            return false;
        }
        ModelChatParticipantConnection modelChatParticipantConnection = (ModelChatParticipantConnection) obj;
        return s6c.m47909a(getItems(), modelChatParticipantConnection.getItems()) && s6c.m47909a(getNextToken(), modelChatParticipantConnection.getNextToken());
    }

    public List<ChatParticipant> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelChatParticipantConnection(List<ChatParticipant> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
