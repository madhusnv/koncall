package com.amplifyframework.datastore.storage.sqlite;

import android.database.Cursor;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SchemaRegistry;
import com.amplifyframework.core.model.SerializedCustomType;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.core.model.types.JavaFieldType;
import com.amplifyframework.datastore.DataStoreException;
import com.amplifyframework.datastore.model.ModelFieldTypeConverter;
import com.amplifyframework.datastore.model.ModelHelper;
import com.amplifyframework.datastore.storage.sqlite.SQLiteModelFieldTypeConverter;
import com.amplifyframework.datastore.storage.sqlite.adapter.SQLiteColumn;
import com.amplifyframework.datastore.storage.sqlite.adapter.SQLiteTable;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.UserAgent;
import com.google.gson.Gson;
import j$.time.LocalTime;
import j$.time.OffsetTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public final class SQLiteModelFieldTypeConverter implements ModelFieldTypeConverter<Cursor, Model> {
    private static final Logger LOGGER = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final Map<String, SQLiteColumn> columns;
    private final Map<String, Integer> cursorInnerModelCounts;
    private final Gson gson;
    private final boolean isInnerModel;
    private final ModelSchema parentSchema;
    private final SchemaRegistry schemaRegistry;

    /* renamed from: com.amplifyframework.datastore.storage.sqlite.SQLiteModelFieldTypeConverter$1 */
    public static /* synthetic */ class C105611 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType;

        static {
            int[] iArr = new int[JavaFieldType.values().length];
            $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType = iArr;
            try {
                iArr[JavaFieldType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.MODEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.CUSTOM_TYPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.DATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.DATE_TIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.TIME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[JavaFieldType.TIMESTAMP.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public SQLiteModelFieldTypeConverter(ModelSchema modelSchema, SchemaRegistry schemaRegistry, Gson gson) {
        this(modelSchema, schemaRegistry, gson, new HashMap());
    }

    private Object convertCustomTypeToTarget(Cursor cursor, ModelField modelField, int i) {
        String string = cursor.getString(i);
        Gson gson = this.gson;
        Class<?> javaClassForValue = modelField.getJavaClassForValue();
        Objects.requireNonNull(javaClassForValue);
        return gson.getAdapter(javaClassForValue).fromJson(string);
    }

    private <E extends Enum<E>> E convertEnumValueToTarget(String str, ModelField modelField) {
        Class<?> javaClassForValue = modelField.getJavaClassForValue();
        Objects.requireNonNull(javaClassForValue);
        return (E) Enum.valueOf(javaClassForValue.asSubclass(Enum.class), str);
    }

    private Object convertModelAssociationToTarget(Cursor cursor, ModelField modelField) {
        return new SQLiteModelFieldTypeConverter(this.schemaRegistry.getModelSchemaForModelClass(modelField.getTargetType()), this.schemaRegistry, this.gson, this.cursorInnerModelCounts).buildMapForModel(cursor);
    }

    public static Object convertRawValueToTarget(Object obj, JavaFieldType javaFieldType, Gson gson) {
        LocalTime localTimeFrom;
        ZoneOffset zoneOffsetFrom;
        if (obj == null) {
            return null;
        }
        Objects.requireNonNull(javaFieldType);
        Objects.requireNonNull(gson);
        switch (C105611.$SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[javaFieldType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                break;
            case 7:
                if (!(obj instanceof Map)) {
                    break;
                } else {
                    break;
                }
            case 8:
                if (!(obj instanceof String)) {
                    break;
                }
                break;
            case 9:
                break;
            case 10:
                if (!(obj instanceof String)) {
                    break;
                }
                break;
            case 11:
                if (!UserAgent.isFlutter() || !(obj instanceof String)) {
                    break;
                }
                break;
            case 12:
                if (!UserAgent.isFlutter() || !(obj instanceof String)) {
                    String str = obj instanceof String ? (String) obj : ((Temporal.Time) obj).format();
                    try {
                        OffsetTime offsetTime = OffsetTime.parse(str, DateTimeFormatter.ISO_OFFSET_TIME);
                        localTimeFrom = LocalTime.from(offsetTime);
                        zoneOffsetFrom = ZoneOffset.from((TemporalAccessor) offsetTime);
                    } catch (Exception unused) {
                        localTimeFrom = LocalTime.parse(str, DateTimeFormatter.ISO_LOCAL_TIME);
                        zoneOffsetFrom = ZoneOffset.UTC;
                    }
                    break;
                }
                break;
            case 13:
                if (!(obj instanceof Integer)) {
                    if (!(obj instanceof Long)) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                LOGGER.warn(String.format("Field of type %s is not supported. Fallback to null.", javaFieldType));
                break;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$convertValueFromSource$0(ModelField modelField) {
        return "Column with name " + modelField.getName() + " does not exist";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$convertValueFromSource$1(String str, ModelField modelField) {
        return "Attempt to convert value \"" + str + "\" from field " + modelField.getName() + " of type " + modelField.getTargetType() + " in model " + this.parentSchema.getName();
    }

    public Map<String, Object> buildMapForModel(Cursor cursor) {
        HashMap map = new HashMap();
        for (Map.Entry<String, ModelField> entry : this.parentSchema.getFields().entrySet()) {
            map.put(entry.getKey(), convertValueFromSource(cursor, entry.getValue()));
        }
        if (!this.isInnerModel) {
            this.cursorInnerModelCounts.clear();
            this.cursorInnerModelCounts.put(this.parentSchema.getName(), 1);
        }
        return map;
    }

    private SQLiteModelFieldTypeConverter(ModelSchema modelSchema, SchemaRegistry schemaRegistry, Gson gson, Map<String, Integer> map) {
        Objects.requireNonNull(modelSchema);
        this.parentSchema = modelSchema;
        Objects.requireNonNull(schemaRegistry);
        this.schemaRegistry = schemaRegistry;
        Objects.requireNonNull(gson);
        this.gson = gson;
        this.columns = SQLiteTable.fromSchema(modelSchema).getColumns();
        this.cursorInnerModelCounts = map;
        boolean z = !map.isEmpty();
        this.isInnerModel = z;
        if (z) {
            return;
        }
        map.put(modelSchema.getName(), 1);
    }

    @Override // com.amplifyframework.datastore.model.ModelFieldTypeConverter
    public Object convertValueFromSource(Cursor cursor, final ModelField modelField) throws DataStoreException, IllegalArgumentException {
        int iIntValue;
        JavaFieldType javaFieldType = TypeConverter.getJavaFieldType(modelField);
        try {
            SQLiteColumn sQLiteColumn = this.columns.get(modelField.getName());
            if (sQLiteColumn == null) {
                LOGGER.verbose(new Supplier() { // from class: o.aze
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return SQLiteModelFieldTypeConverter.lambda$convertValueFromSource$0(modelField);
                    }
                });
                return null;
            }
            String aliasedName = sQLiteColumn.getAliasedName();
            if (javaFieldType == JavaFieldType.MODEL) {
                String targetType = modelField.getTargetType();
                if (this.cursorInnerModelCounts.containsKey(targetType)) {
                    Integer num = this.cursorInnerModelCounts.get(targetType);
                    iIntValue = (num == null ? 0 : num.intValue()) + 1;
                } else {
                    iIntValue = 1;
                }
                this.cursorInnerModelCounts.put(targetType, Integer.valueOf(iIntValue));
            }
            if (this.isInnerModel && this.cursorInnerModelCounts.containsKey(this.parentSchema.getName())) {
                Integer num2 = this.cursorInnerModelCounts.get(this.parentSchema.getName());
                if (!Objects.equals(num2, 1)) {
                    aliasedName = aliasedName + num2;
                }
            }
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow(aliasedName);
            if (cursor.isNull(columnIndexOrThrow)) {
                return null;
            }
            final String string = cursor.getString(columnIndexOrThrow);
            Logger logger = LOGGER;
            logger.verbose(new Supplier() { // from class: o.bze
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f17032a.lambda$convertValueFromSource$1(string, modelField);
                }
            });
            switch (C105611.$SwitchMap$com$amplifyframework$core$model$types$JavaFieldType[javaFieldType.ordinal()]) {
                case 1:
                    return Integer.valueOf(cursor.getInt(columnIndexOrThrow));
                case 2:
                    return Long.valueOf(cursor.getLong(columnIndexOrThrow));
                case 3:
                    return Float.valueOf(cursor.getFloat(columnIndexOrThrow));
                case 4:
                    return Double.valueOf(cursor.getDouble(columnIndexOrThrow));
                case 5:
                    return cursor.getString(columnIndexOrThrow);
                case 6:
                    return Boolean.valueOf(cursor.getInt(columnIndexOrThrow) != 0);
                case 7:
                    return convertModelAssociationToTarget(cursor, modelField);
                case 8:
                    return convertEnumValueToTarget(string, modelField);
                case 9:
                    return convertCustomTypeToTarget(cursor, modelField, columnIndexOrThrow);
                case 10:
                    return new Temporal.Date(string);
                case 11:
                    return new Temporal.DateTime(string);
                case 12:
                    return new Temporal.Time(string);
                case 13:
                    return new Temporal.Timestamp(cursor.getLong(columnIndexOrThrow), TimeUnit.SECONDS);
                default:
                    logger.warn(String.format("Field of type %s is not supported. Fallback to null.", javaFieldType));
                    return null;
            }
        } catch (Exception e) {
            throw new DataStoreException(String.format("Error converting field \"%s\" from model \"%s\"", modelField.getName(), this.parentSchema.getName()), e, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
        }
    }

    @Override // com.amplifyframework.datastore.model.ModelFieldTypeConverter
    public Object convertValueFromTarget(Model model, ModelField modelField) throws DataStoreException, NoSuchFieldException, SecurityException {
        Object value;
        if (model.getClass() == SerializedModel.class) {
            value = ((SerializedModel) model).getValue(modelField);
            if (modelField.isCustomType() && value != null) {
                if (modelField.isArray()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) value).iterator();
                    while (it.hasNext()) {
                        arrayList.add(((SerializedCustomType) it.next()).getFlatSerializedData());
                    }
                    value = arrayList;
                } else {
                    value = ((SerializedCustomType) value).getFlatSerializedData();
                }
            }
        } else {
            value = ModelHelper.getValue(model, modelField);
        }
        if (value == null) {
            return null;
        }
        return convertRawValueToTarget(value, TypeConverter.getJavaFieldType(modelField), this.gson);
    }
}
