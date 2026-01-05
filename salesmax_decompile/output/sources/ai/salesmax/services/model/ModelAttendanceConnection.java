package ai.salesmax.services.model;

import com.amplifyframework.datastore.generated.model.Attendance;
import java.util.List;
import p001o.s6c;

/* loaded from: classes.dex */
public final class ModelAttendanceConnection {
    private final List<Attendance> items;
    private final String nextToken;

    public interface BuildStep {
        ModelAttendanceConnection build();

        BuildStep items(List<Attendance> list);

        BuildStep nextToken(String str);
    }

    public static class Builder implements BuildStep {
        private List<Attendance> items;
        private String nextToken;

        @Override // ai.salesmax.services.model.ModelAttendanceConnection.BuildStep
        public ModelAttendanceConnection build() {
            return new ModelAttendanceConnection(this.items, this.nextToken);
        }

        @Override // ai.salesmax.services.model.ModelAttendanceConnection.BuildStep
        public BuildStep items(List<Attendance> list) {
            this.items = list;
            return this;
        }

        @Override // ai.salesmax.services.model.ModelAttendanceConnection.BuildStep
        public BuildStep nextToken(String str) {
            this.nextToken = str;
            return this;
        }
    }

    public final class CopyOfBuilder extends Builder {
        @Override // ai.salesmax.services.model.ModelAttendanceConnection.Builder, ai.salesmax.services.model.ModelAttendanceConnection.BuildStep
        public /* bridge */ /* synthetic */ BuildStep items(List list) {
            return items((List<Attendance>) list);
        }

        private CopyOfBuilder(List<Attendance> list, String str) {
            super.items(list).nextToken(str);
        }

        @Override // ai.salesmax.services.model.ModelAttendanceConnection.Builder, ai.salesmax.services.model.ModelAttendanceConnection.BuildStep
        public CopyOfBuilder items(List<Attendance> list) {
            return (CopyOfBuilder) super.items(list);
        }

        @Override // ai.salesmax.services.model.ModelAttendanceConnection.Builder, ai.salesmax.services.model.ModelAttendanceConnection.BuildStep
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
        if (obj == null || ModelAttendanceConnection.class != obj.getClass()) {
            return false;
        }
        ModelAttendanceConnection modelAttendanceConnection = (ModelAttendanceConnection) obj;
        return s6c.m47909a(getItems(), modelAttendanceConnection.getItems()) && s6c.m47909a(getNextToken(), modelAttendanceConnection.getNextToken());
    }

    public List<Attendance> getItems() {
        return this.items;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public int hashCode() {
        return (getItems() + getNextToken()).hashCode();
    }

    private ModelAttendanceConnection(List<Attendance> list, String str) {
        this.items = list;
        this.nextToken = str;
    }
}
