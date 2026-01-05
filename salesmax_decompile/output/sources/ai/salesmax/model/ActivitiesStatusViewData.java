package ai.salesmax.model;

import ai.salesmax.model.event.ItemChangeEvent;
import ai.salesmax.model.event.ItemChangeListener;
import java.util.ArrayList;
import java.util.Iterator;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes.dex */
public final class ActivitiesStatusViewData {
    public static final int $stable = 8;
    private ArrayList<ActivitiesStatus> activitiesStatuses;
    private ArrayList<ItemChangeListener<ActivitiesStatusViewData>> listeners;
    private boolean shouldDisplay;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivitiesStatusViewData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void fireChangeEvent() {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((ItemChangeListener) it.next()).onItemChanged(new ItemChangeEvent(this, this));
        }
    }

    public final void addDisplayListener(ItemChangeListener<ActivitiesStatusViewData> itemChangeListener) {
        sq8.m48649h(itemChangeListener, "value");
        this.listeners.add(itemChangeListener);
    }

    public final ArrayList<ActivitiesStatus> getActivitiesStatuses() {
        return this.activitiesStatuses;
    }

    public final ArrayList<ItemChangeListener<ActivitiesStatusViewData>> getListeners() {
        return this.listeners;
    }

    public final boolean getShouldDisplay() {
        return this.shouldDisplay;
    }

    public final void setActivitiesStatuses(ArrayList<ActivitiesStatus> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.activitiesStatuses = arrayList;
    }

    public final void setListeners(ArrayList<ItemChangeListener<ActivitiesStatusViewData>> arrayList) {
        sq8.m48649h(arrayList, "<set-?>");
        this.listeners = arrayList;
    }

    public final void setShouldDisplay(boolean z) {
        this.shouldDisplay = z;
    }

    public final void setShouldDisplayValue(boolean z) {
        this.shouldDisplay = z;
        fireChangeEvent();
    }

    public ActivitiesStatusViewData(ArrayList<ActivitiesStatus> arrayList) {
        sq8.m48649h(arrayList, "activitiesStatuses");
        this.activitiesStatuses = arrayList;
        this.listeners = new ArrayList<>();
        this.shouldDisplay = true;
    }

    public /* synthetic */ ActivitiesStatusViewData(ArrayList arrayList, int i, id5 id5Var) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }
}
