package ai.salesmax.model;

/* loaded from: classes.dex */
public final class TodoViewCounts {
    public static final int $stable = 0;
    private final int callsCount;
    private final int completedTasksCount;
    private final int openTasksCount;
    private final int visitsCount;

    public TodoViewCounts(int i, int i2, int i3, int i4) {
        this.openTasksCount = i;
        this.completedTasksCount = i2;
        this.callsCount = i3;
        this.visitsCount = i4;
    }

    public static /* synthetic */ TodoViewCounts copy$default(TodoViewCounts todoViewCounts, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = todoViewCounts.openTasksCount;
        }
        if ((i5 & 2) != 0) {
            i2 = todoViewCounts.completedTasksCount;
        }
        if ((i5 & 4) != 0) {
            i3 = todoViewCounts.callsCount;
        }
        if ((i5 & 8) != 0) {
            i4 = todoViewCounts.visitsCount;
        }
        return todoViewCounts.copy(i, i2, i3, i4);
    }

    public final String callTaskCount() {
        return String.valueOf(this.callsCount);
    }

    public final int callTaskInPercentage() {
        int i = this.callsCount;
        int i2 = totalCounts();
        StringBuilder sb = new StringBuilder();
        sb.append("Active calls count : ");
        sb.append(i);
        sb.append(", totalCounts: ");
        sb.append(i2);
        return (int) (((this.callsCount * 1.0d) / totalCounts()) * 100.0d);
    }

    public final String completedTaskCount() {
        return String.valueOf(this.completedTasksCount);
    }

    public final int completedTaskInPercentage() {
        int i = this.completedTasksCount;
        int i2 = totalCounts();
        StringBuilder sb = new StringBuilder();
        sb.append("Completed task count : ");
        sb.append(i);
        sb.append(", totalCounts: ");
        sb.append(i2);
        return (int) (((this.completedTasksCount * 1.0d) / totalCounts()) * 100.0d);
    }

    public final int component1() {
        return this.openTasksCount;
    }

    public final int component2() {
        return this.completedTasksCount;
    }

    public final int component3() {
        return this.callsCount;
    }

    public final int component4() {
        return this.visitsCount;
    }

    public final TodoViewCounts copy(int i, int i2, int i3, int i4) {
        return new TodoViewCounts(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodoViewCounts)) {
            return false;
        }
        TodoViewCounts todoViewCounts = (TodoViewCounts) obj;
        return this.openTasksCount == todoViewCounts.openTasksCount && this.completedTasksCount == todoViewCounts.completedTasksCount && this.callsCount == todoViewCounts.callsCount && this.visitsCount == todoViewCounts.visitsCount;
    }

    public final int getCallsCount() {
        return this.callsCount;
    }

    public final int getCompletedTasksCount() {
        return this.completedTasksCount;
    }

    public final int getOpenTasksCount() {
        return this.openTasksCount;
    }

    public final int getVisitsCount() {
        return this.visitsCount;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.openTasksCount) * 31) + Integer.hashCode(this.completedTasksCount)) * 31) + Integer.hashCode(this.callsCount)) * 31) + Integer.hashCode(this.visitsCount);
    }

    public final String openTaskCount() {
        return String.valueOf(this.openTasksCount);
    }

    public final int openTaskInPercentage() {
        int i = this.openTasksCount;
        int i2 = totalCounts();
        StringBuilder sb = new StringBuilder();
        sb.append("Open task count : ");
        sb.append(i);
        sb.append(", totalCounts: ");
        sb.append(i2);
        return (int) (((this.openTasksCount * 1.0d) / totalCounts()) * 100.0d);
    }

    public String toString() {
        return "TodoViewCounts(openTasksCount=" + this.openTasksCount + ", completedTasksCount=" + this.completedTasksCount + ", callsCount=" + this.callsCount + ", visitsCount=" + this.visitsCount + ")";
    }

    public final int totalCounts() {
        return this.openTasksCount + this.completedTasksCount;
    }

    public final String visitTaskCount() {
        return String.valueOf(this.visitsCount);
    }

    public final int visitTaskInPercentage() {
        int i = this.visitsCount;
        int i2 = totalCounts();
        StringBuilder sb = new StringBuilder();
        sb.append("Active visits count : ");
        sb.append(i);
        sb.append(", totalCounts: ");
        sb.append(i2);
        return (int) (((this.visitsCount * 1.0d) / totalCounts()) * 100.0d);
    }
}
