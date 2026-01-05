package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public abstract class wcb {
    /* renamed from: a */
    public static final String m54215a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m54216b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? ((Float) obj).floatValue() == 0.0f : obj instanceof Double ? ((Double) obj).doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : obj instanceof String ? obj.equals("") : obj instanceof yq1 ? obj.equals(yq1.f55802b) : obj instanceof rcb ? obj == ((rcb) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    /* renamed from: c */
    public static final void m54217c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m54217c(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m54217c(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(TokenParser.SP);
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(hhh.m30606c((String) obj));
            sb.append(TokenParser.DQUOTE);
            return;
        }
        if (obj instanceof yq1) {
            sb.append(": \"");
            sb.append(hhh.m30604a((yq1) obj));
            sb.append(TokenParser.DQUOTE);
            return;
        }
        if (obj instanceof vn7) {
            sb.append(" {");
            m54218d((vn7) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(TokenParser.SP);
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        m54217c(sb, i4, TransferTable.COLUMN_KEY, entry.getKey());
        m54217c(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(TokenParser.SP);
            i2++;
        }
        sb.append("}");
    }

    /* renamed from: d */
    public static void m54218d(rcb rcbVar, StringBuilder sb, int i) throws SecurityException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : rcbVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            boolean zBooleanValue = true;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String str2 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m54217c(sb, i, m54215a(str2), vn7.m53045r(method2, rcbVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String str3 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m54217c(sb, i, m54215a(str3), vn7.m53045r(method3, rcbVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set" + strSubstring)) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    if (map.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                    }
                }
                String str4 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1);
                Method method4 = (Method) map.get("get" + strSubstring);
                Method method5 = (Method) map.get("has" + strSubstring);
                if (method4 != null) {
                    Object objM53045r = vn7.m53045r(method4, rcbVar, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) vn7.m53045r(method5, rcbVar, new Object[0])).booleanValue();
                    } else if (m54216b(objM53045r)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        m54217c(sb, i, m54215a(str4), objM53045r);
                    }
                }
            }
        }
        m4i m4iVar = ((vn7) rcbVar).unknownFields;
        if (m4iVar != null) {
            m4iVar.m38373m(sb, i);
        }
    }

    /* renamed from: e */
    public static String m54219e(rcb rcbVar, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m54218d(rcbVar, sb, 0);
        return sb.toString();
    }
}
