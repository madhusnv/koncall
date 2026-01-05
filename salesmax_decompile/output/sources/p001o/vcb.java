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
import p001o.wn7;

/* loaded from: classes6.dex */
public abstract class vcb {
    /* renamed from: a */
    public static final String m52516a(String str) {
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
    public static boolean m52517b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? ((Float) obj).floatValue() == 0.0f : obj instanceof Double ? ((Double) obj).doubleValue() == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : obj instanceof String ? obj.equals("") : obj instanceof xq1 ? obj.equals(xq1.f54049b) : obj instanceof scb ? obj == ((scb) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    /* renamed from: c */
    public static final void m52518c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m52518c(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m52518c(sb, i, str, (Map.Entry) it2.next());
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
            sb.append(ghh.m28726c((String) obj));
            sb.append(TokenParser.DQUOTE);
            return;
        }
        if (obj instanceof xq1) {
            sb.append(": \"");
            sb.append(ghh.m28724a((xq1) obj));
            sb.append(TokenParser.DQUOTE);
            return;
        }
        if (obj instanceof wn7) {
            sb.append(" {");
            m52519d((wn7) obj, sb, i + 2);
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
        m52518c(sb, i4, TransferTable.COLUMN_KEY, entry.getKey());
        m52518c(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(TokenParser.SP);
            i2++;
        }
        sb.append("}");
    }

    /* renamed from: d */
    public static void m52519d(scb scbVar, StringBuilder sb, int i) throws SecurityException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : scbVar.getClass().getDeclaredMethods()) {
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
                    m52518c(sb, i, m52516a(str2), wn7.invokeOrDie(method2, scbVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String str3 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m52518c(sb, i, m52516a(str3), wn7.invokeOrDie(method3, scbVar, new Object[0]));
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
                    Object objInvokeOrDie = wn7.invokeOrDie(method4, scbVar, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) wn7.invokeOrDie(method5, scbVar, new Object[0])).booleanValue();
                    } else if (m52517b(objInvokeOrDie)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        m52518c(sb, i, m52516a(str4), objInvokeOrDie);
                    }
                }
            }
        }
        if (scbVar instanceof wn7.AbstractC17937d) {
            Iterator itM27509s = ((wn7.AbstractC17937d) scbVar).extensions.m27509s();
            while (itM27509s.hasNext()) {
                Map.Entry entry = (Map.Entry) itM27509s.next();
                m52518c(sb, i, "[" + ((wn7.C17938e) entry.getKey()).getNumber() + "]", entry.getValue());
            }
        }
        l4i l4iVar = ((wn7) scbVar).unknownFields;
        if (l4iVar != null) {
            l4iVar.m36579p(sb, i);
        }
    }

    /* renamed from: e */
    public static String m52520e(scb scbVar, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m52519d(scbVar, sb, 0);
        return sb.toString();
    }
}
