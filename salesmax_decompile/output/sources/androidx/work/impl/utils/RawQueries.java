package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p001o.dh3;
import p001o.kh3;
import p001o.oeg;
import p001o.sq8;
import p001o.ttf;

/* loaded from: classes2.dex */
public final class RawQueries {
    private static final void bindings(StringBuilder sb, int i) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        sb.append(kh3.p0(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    public static final oeg toRawQuery(WorkQuery workQuery) {
        sq8.m48649h(workQuery, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        sq8.m48648g(workQuery.getStates(), "states");
        String str = " AND";
        String str2 = " WHERE";
        if (!r2.isEmpty()) {
            List<WorkInfo.State> states = workQuery.getStates();
            sq8.m48648g(states, "states");
            ArrayList arrayList2 = new ArrayList(dh3.m23088v(states, 10));
            for (WorkInfo.State state : states) {
                sq8.m48646e(state);
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt(state)));
            }
            sb.append(" WHERE state IN (");
            bindings(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        sq8.m48648g(workQuery.getIds(), "ids");
        if (!r2.isEmpty()) {
            List<UUID> ids = workQuery.getIds();
            sq8.m48648g(ids, "ids");
            ArrayList arrayList3 = new ArrayList(dh3.m23088v(ids, 10));
            Iterator<T> it = ids.iterator();
            while (it.hasNext()) {
                arrayList3.add(((UUID) it.next()).toString());
            }
            sb.append(str2 + " id IN (");
            bindings(sb, workQuery.getIds().size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        sq8.m48648g(workQuery.getTags(), "tags");
        if (!r2.isEmpty()) {
            sb.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb, workQuery.getTags().size());
            sb.append("))");
            List<String> tags = workQuery.getTags();
            sq8.m48648g(tags, "tags");
            arrayList.addAll(tags);
        } else {
            str = str2;
        }
        sq8.m48648g(workQuery.getUniqueWorkNames(), "uniqueWorkNames");
        if (!r2.isEmpty()) {
            sb.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb, workQuery.getUniqueWorkNames().size());
            sb.append("))");
            List<String> uniqueWorkNames = workQuery.getUniqueWorkNames();
            sq8.m48648g(uniqueWorkNames, "uniqueWorkNames");
            arrayList.addAll(uniqueWorkNames);
        }
        sb.append(";");
        String string = sb.toString();
        sq8.m48648g(string, "builder.toString()");
        return new ttf(string, arrayList.toArray(new Object[0]));
    }
}
