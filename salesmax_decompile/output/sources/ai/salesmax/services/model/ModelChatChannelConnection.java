package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.ChatChannel;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelChatChannelConnection {
    private final List<ChatChannel> items;
    private final String nextToken;

    public interface BuildStep {
        ModelChatChannelConnection build();

        BuildStep items(List<ChatChannel> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<ChatChannel> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelChatChannelConnection.BuildStep
        public ModelChatChannelConnection build() {
            return new ModelChatChannelConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelChatChannelConnection.BuildStep
        public BuildStep items(List<ChatChannel> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelChatChannelConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelChatChannelConnection.Builder, ai.salesmax.services.model.ModelChatChannelConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<ChatChannel>) list);
        }

        private CopyOfBuilder(List<ChatChannel> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelChatChannelConnection.Builder, ai.salesmax.services.model.ModelChatChannelConnection.BuildStep
        public CopyOfBuilder items(List<ChatChannel> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelChatChannelConnection.Builder, ai.salesmax.services.model.ModelChatChannelConnection.BuildStep
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
        if (obj == null || ModelChatChannelConnection.class != obj.getClass()) {
            return false;
        }
        ModelChatChannelConnection modelChatChannelConnection = (ModelChatChannelConnection) obj;
        return s6c.m47909a(getItems(), modelChatChannelConnection.getItems()) && s6c.m47909a(getNextToken(), modelChatChannelConnection.getNextToken());
    }

    public List<ChatChannel> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelChatChannelConnection(List<ChatChannel> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
