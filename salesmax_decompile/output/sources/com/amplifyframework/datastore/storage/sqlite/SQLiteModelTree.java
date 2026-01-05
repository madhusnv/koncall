package com.amplifyframework.datastore.storage.sqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelAssociation;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SchemaRegistry;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.datastore.storage.sqlite.adapter.SQLiteTable;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Empty;
import com.amplifyframework.util.GsonFactory;
import com.amplifyframework.util.Wrap;
import com.google.gson.Gson;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
final class SQLiteModelTree {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final SQLiteDatabase database;
    private final Gson gson = GsonFactory.instance();
    private final SchemaRegistry registry;

    public SQLiteModelTree(SchemaRegistry schemaRegistry, SQLiteDatabase sQLiteDatabase) {
        this.registry = schemaRegistry;
        this.database = sQLiteDatabase;
    }

    private String getChildFieldString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            sb.append(Wrap.inBackticks(listIterator.next()));
            if (listIterator.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private String getModelName(Model model) {
        return model.getClass() == SerializedModel.class ? ((SerializedModel) model).getModelName() : model.getClass().getSimpleName();
    }

    private Cursor queryChildren(String str, List<String> list, String str2, Collection<Serializable> collection) {
        StringBuilder sb = new StringBuilder();
        Iterator<Serializable> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Wrap.inSingleQuotes(it.next().toString()));
            if (it.hasNext()) {
                sb.append(SqlKeyword.SEPARATOR);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(SqlKeyword.SELECT));
        SqlKeyword sqlKeyword = SqlKeyword.DELIMITER;
        sb2.append(sqlKeyword);
        sb2.append(getChildFieldString(list));
        sb2.append(sqlKeyword);
        sb2.append(SqlKeyword.FROM);
        sb2.append(sqlKeyword);
        sb2.append(Wrap.inBackticks(str));
        sb2.append(sqlKeyword);
        sb2.append(SqlKeyword.WHERE);
        sb2.append(sqlKeyword);
        sb2.append(Wrap.inBackticks(str2));
        sb2.append(sqlKeyword);
        sb2.append(SqlKeyword.IN);
        sb2.append(sqlKeyword);
        sb2.append(Wrap.inParentheses(sb.toString()));
        sb2.append(";");
        return this.database.rawQuery(sb2.toString(), new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void recurseTree(Map<ModelSchema, Set<HashMap<String, String>>> map, ModelSchema modelSchema, Collection<Serializable> collection) {
        char c;
        for (ModelAssociation modelAssociation : modelSchema.getAssociations().values()) {
            String name = modelAssociation.getName();
            int iHashCode = name.hashCode();
            if (iHashCode != -2140581492) {
                if (iHashCode != -1933588487) {
                    c = (iHashCode == 1246028943 && name.equals("BelongsTo")) ? (char) 2 : (char) 65535;
                } else if (name.equals("HasMany")) {
                    c = 1;
                }
            } else if (name.equals("HasOne")) {
                c = 0;
            }
            if (c == 0 || c == 1) {
                ModelSchema modelSchemaForModelClass = this.registry.getModelSchemaForModelClass(modelAssociation.getAssociatedType());
                SQLiteTable sQLiteTableFromSchema = SQLiteTable.fromSchema(modelSchemaForModelClass);
                List<String> arrayList = new ArrayList<>();
                try {
                    arrayList.add(sQLiteTableFromSchema.getPrimaryKey().getName());
                    if (modelSchemaForModelClass.getPrimaryIndexFields().size() > 1) {
                        arrayList.addAll(modelSchemaForModelClass.getPrimaryIndexFields());
                    }
                    String foreignKeyColumnName = SQLiteTable.getForeignKeyColumnName(modelSchemaForModelClass.getVersion(), modelAssociation.getAssociatedName(), modelSchemaForModelClass.getAssociations().get(modelAssociation.getAssociatedName()));
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    try {
                        Cursor cursorQueryChildren = queryChildren(sQLiteTableFromSchema.getName(), arrayList, foreignKeyColumnName, collection);
                        if (cursorQueryChildren != null) {
                            try {
                                if (cursorQueryChildren.moveToFirst()) {
                                    do {
                                        HashMap<String, String> map2 = new HashMap<>();
                                        for (String str : arrayList) {
                                            String string = cursorQueryChildren.getString(cursorQueryChildren.getColumnIndexOrThrow(str));
                                            if (!str.equals(SQLiteTable.PRIMARY_KEY_FIELD_NAME)) {
                                                map2.put(str, string);
                                            }
                                            if (str.equals(sQLiteTableFromSchema.getPrimaryKey().getName())) {
                                                hashSet.add(string);
                                            }
                                        }
                                        hashSet2.add(map2);
                                    } while (cursorQueryChildren.moveToNext());
                                }
                            } catch (Throwable th) {
                                try {
                                    cursorQueryChildren.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        if (cursorQueryChildren != null) {
                            cursorQueryChildren.close();
                        }
                    } catch (SQLiteException e) {
                        LOG.warn("Failed to query children of deleted model(s).", e);
                    }
                    if (!hashSet.isEmpty()) {
                        if (map.containsKey(modelSchemaForModelClass)) {
                            map.get(modelSchemaForModelClass).addAll(hashSet2);
                        } else {
                            map.put(modelSchemaForModelClass, hashSet2);
                        }
                        recurseTree(map, modelSchemaForModelClass, hashSet);
                    }
                } catch (NullPointerException e2) {
                    LOG.warn("Foreign key was not found due to unidirectional relationship without @BelongsTo. Failed to publish cascading mutations.", e2);
                    return;
                }
            }
        }
    }

    public <T extends Model> List<Model> descendantsOf(Collection<T> collection) {
        String json;
        if (Empty.check((Collection<?>) collection)) {
            return new ArrayList();
        }
        Map<ModelSchema, Set<HashMap<String, String>>> linkedHashMap = new LinkedHashMap<>();
        Model next = collection.iterator().next();
        ModelSchema modelSchemaForModelClass = this.registry.getModelSchemaForModelClass(getModelName(next));
        HashSet hashSet = new HashSet();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getPrimaryKeyString());
        }
        recurseTree(linkedHashMap, modelSchemaForModelClass, hashSet);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ModelSchema, Set<HashMap<String, String>>> entry : linkedHashMap.entrySet()) {
            ModelSchema key = entry.getKey();
            for (HashMap<String, String> map : entry.getValue()) {
                if (next.getClass() == SerializedModel.class) {
                    HashMap map2 = new HashMap();
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        map2.put(entry2.getKey(), entry2.getValue());
                    }
                    arrayList.add(SerializedModel.builder().modelSchema(key).serializedData(map2).build());
                } else {
                    HashMap map3 = new HashMap();
                    if (key.getPrimaryIndexFields().size() > 1) {
                        ListIterator<String> listIterator = key.getPrimaryIndexFields().listIterator();
                        while (listIterator.hasNext()) {
                            String next2 = listIterator.next();
                            map3.put(next2, map.get(next2));
                        }
                        json = this.gson.toJson(map3);
                    } else {
                        json = this.gson.toJson(Collections.singletonMap(OutcomeConstants.OUTCOME_ID, map.get(OutcomeConstants.OUTCOME_ID)));
                    }
                    arrayList.add((Model) this.gson.fromJson(json, (Class) key.getModelClass()));
                }
            }
        }
        return arrayList;
    }
}
