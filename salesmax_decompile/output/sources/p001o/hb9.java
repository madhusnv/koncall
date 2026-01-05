package p001o;

/* loaded from: classes6.dex */
public abstract class hb9 {
    /* renamed from: a */
    public static final Class m30150a(ob9 ob9Var) {
        sq8.m48649h(ob9Var, "<this>");
        Class clsMo22647b = ((da3) ob9Var).mo22647b();
        sq8.m48647f(clsMo22647b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo22647b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: b */
    public static final Class m30151b(ob9 ob9Var) {
        sq8.m48649h(ob9Var, "<this>");
        Class clsMo22647b = ((da3) ob9Var).mo22647b();
        if (!clsMo22647b.isPrimitive()) {
            sq8.m48647f(clsMo22647b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return clsMo22647b;
        }
        String name = clsMo22647b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    clsMo22647b = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    clsMo22647b = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    clsMo22647b = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    clsMo22647b = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    clsMo22647b = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    clsMo22647b = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    clsMo22647b = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    clsMo22647b = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    clsMo22647b = Short.class;
                    break;
                }
                break;
        }
        sq8.m48647f(clsMo22647b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return clsMo22647b;
    }

    /* renamed from: c */
    public static final ob9 m30152c(Class cls) {
        sq8.m48649h(cls, "<this>");
        return kge.m35689b(cls);
    }
}
