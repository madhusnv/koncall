package androidx.room.util;

import android.database.Cursor;
import androidx.room.util.TableInfo;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p001o.bh3;
import p001o.hsa;
import p001o.isa;
import p001o.kh3;
import p001o.leg;
import p001o.mif;
import p001o.sq8;
import p001o.tb3;

/* loaded from: classes2.dex */
public final class TableInfoKt {
    private static final Map<String, TableInfo.Column> readColumns(leg legVar, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Cursor cursorQuery = legVar.query("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorQuery.getColumnCount() <= 0) {
                Map<String, TableInfo.Column> mapM32681h = isa.m32681h();
                tb3.m49666a(cursorQuery, null);
                return mapM32681h;
            }
            int columnIndex = cursorQuery.getColumnIndex("name");
            int columnIndex2 = cursorQuery.getColumnIndex("type");
            int columnIndex3 = cursorQuery.getColumnIndex("notnull");
            int columnIndex4 = cursorQuery.getColumnIndex("pk");
            int columnIndex5 = cursorQuery.getColumnIndex("dflt_value");
            Map mapM31053c = hsa.m31053c();
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndex);
                String string2 = cursorQuery.getString(columnIndex2);
                boolean z = cursorQuery.getInt(columnIndex3) != 0;
                int i = cursorQuery.getInt(columnIndex4);
                String string3 = cursorQuery.getString(columnIndex5);
                sq8.m48648g(string, "name");
                sq8.m48648g(string2, "type");
                mapM31053c.put(string, new TableInfo.Column(string, string2, z, i, string3, 2));
            }
            Map<String, TableInfo.Column> mapM31052b = hsa.m31052b(mapM31053c);
            tb3.m49666a(cursorQuery, null);
            return mapM31052b;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tb3.m49666a(cursorQuery, th);
                throw th2;
            }
        }
    }

    private static final List<TableInfo.ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(OutcomeConstants.OUTCOME_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex(Constants.MessagePayloadKeys.FROM);
        int columnIndex4 = cursor.getColumnIndex("to");
        List listM18961c = bh3.m18961c();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            sq8.m48648g(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            sq8.m48648g(string2, "cursor.getString(toColumnIndex)");
            listM18961c.add(new TableInfo.ForeignKeyWithSequence(i, i2, string, string2));
        }
        return kh3.G0(bh3.m18959a(listM18961c));
    }

    private static final Set<TableInfo.ForeignKey> readForeignKeys(leg legVar, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Cursor cursorQuery = legVar.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex(OutcomeConstants.OUTCOME_ID);
            int columnIndex2 = cursorQuery.getColumnIndex("seq");
            int columnIndex3 = cursorQuery.getColumnIndex("table");
            int columnIndex4 = cursorQuery.getColumnIndex("on_delete");
            int columnIndex5 = cursorQuery.getColumnIndex("on_update");
            List<TableInfo.ForeignKeyWithSequence> foreignKeyFieldMappings = readForeignKeyFieldMappings(cursorQuery);
            cursorQuery.moveToPosition(-1);
            Set setM39135b = mif.m39135b();
            while (cursorQuery.moveToNext()) {
                if (cursorQuery.getInt(columnIndex2) == 0) {
                    int i = cursorQuery.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<TableInfo.ForeignKeyWithSequence> arrayList3 = new ArrayList();
                    for (Object obj : foreignKeyFieldMappings) {
                        if (((TableInfo.ForeignKeyWithSequence) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (TableInfo.ForeignKeyWithSequence foreignKeyWithSequence : arrayList3) {
                        arrayList.add(foreignKeyWithSequence.getFrom());
                        arrayList2.add(foreignKeyWithSequence.getTo());
                    }
                    String string = cursorQuery.getString(columnIndex3);
                    sq8.m48648g(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorQuery.getString(columnIndex4);
                    sq8.m48648g(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorQuery.getString(columnIndex5);
                    sq8.m48648g(string3, "cursor.getString(onUpdateColumnIndex)");
                    setM39135b.add(new TableInfo.ForeignKey(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<TableInfo.ForeignKey> setM39134a = mif.m39134a(setM39135b);
            tb3.m49666a(cursorQuery, null);
            return setM39134a;
        } finally {
        }
    }

    private static final TableInfo.Index readIndex(leg legVar, String str, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Cursor cursorQuery = legVar.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("seqno");
            int columnIndex2 = cursorQuery.getColumnIndex("cid");
            int columnIndex3 = cursorQuery.getColumnIndex("name");
            int columnIndex4 = cursorQuery.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorQuery.moveToNext()) {
                    if (cursorQuery.getInt(columnIndex2) >= 0) {
                        int i = cursorQuery.getInt(columnIndex);
                        String string = cursorQuery.getString(columnIndex3);
                        String str2 = cursorQuery.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        sq8.m48648g(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                sq8.m48648g(collectionValues, "columnsMap.values");
                List listQ0 = kh3.Q0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                sq8.m48648g(collectionValues2, "ordersMap.values");
                TableInfo.Index index = new TableInfo.Index(str, z, listQ0, kh3.Q0(collectionValues2));
                tb3.m49666a(cursorQuery, null);
                return index;
            }
            tb3.m49666a(cursorQuery, null);
            return null;
        } finally {
        }
    }

    private static final Set<TableInfo.Index> readIndices(leg legVar, String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Cursor cursorQuery = legVar.query("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorQuery.getColumnIndex("name");
            int columnIndex2 = cursorQuery.getColumnIndex("origin");
            int columnIndex3 = cursorQuery.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setM39135b = mif.m39135b();
                while (cursorQuery.moveToNext()) {
                    if (sq8.m48644c("c", cursorQuery.getString(columnIndex2))) {
                        String string = cursorQuery.getString(columnIndex);
                        boolean z = true;
                        if (cursorQuery.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        sq8.m48648g(string, "name");
                        TableInfo.Index index = readIndex(legVar, string, z);
                        if (index == null) {
                            tb3.m49666a(cursorQuery, null);
                            return null;
                        }
                        setM39135b.add(index);
                    }
                }
                Set<TableInfo.Index> setM39134a = mif.m39134a(setM39135b);
                tb3.m49666a(cursorQuery, null);
                return setM39134a;
            }
            tb3.m49666a(cursorQuery, null);
            return null;
        } finally {
        }
    }

    public static final TableInfo readTableInfo(leg legVar, String str) {
        sq8.m48649h(legVar, "database");
        sq8.m48649h(str, "tableName");
        return new TableInfo(str, readColumns(legVar, str), readForeignKeys(legVar, str), readIndices(legVar, str));
    }
}
