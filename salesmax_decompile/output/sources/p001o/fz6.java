package p001o;

import ai.salesmax.model.FileObjectRelationshipSummary;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.UploadedFile;
import com.amplifyframework.datastore.generated.model.fileObjectRelationship;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public abstract class fz6 {
    /* renamed from: A */
    public static /* synthetic */ List m27783A(ArrayList arrayList) {
        return arrayList;
    }

    /* renamed from: B */
    public static /* synthetic */ x8c m27784B(List list, final String str, final String str2, final l1 l1Var) {
        return x6c.e0((List) list.stream().map(new Function() { // from class: o.bz6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fz6.m27812z(l1Var, str, str2, (FileObjectRelationshipSummary) obj);
            }
        }).collect(Collectors.toList())).d0(new az6()).m55733m(new ArrayList(), new wy6()).m55027y().d0(new rl7() { // from class: o.cz6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return fz6.m27783A((ArrayList) obj);
            }
        });
    }

    /* renamed from: C */
    public static x6c m27785C(final String str, final String str2, final String str3) {
        return m27800n().m55717M(new rl7() { // from class: o.qy6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return fz6.m27806t(str, str2, str3, (l1) obj);
            }
        }).m55733m(new ArrayList(), new wy6()).m55019p(new rl7() { // from class: o.xy6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return fz6.m27807u((ArrayList) obj);
            }
        }).m55027y();
    }

    /* renamed from: D */
    public static x6c m27786D(final String str, final String str2, final List list) {
        return list.isEmpty() ? x6c.c0(Collections.emptyList()) : m27800n().m55717M(new rl7() { // from class: o.yy6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return fz6.m27784B(list, str, str2, (l1) obj);
            }
        });
    }

    /* renamed from: n */
    public static x6c m27800n() {
        return uni.LB().d0(new gd()).d0(new hd());
    }

    /* renamed from: o */
    public static x6c m27801o(final List list) {
        return list.isEmpty() ? x6c.c0(Collections.emptyList()) : m27800n().m55717M(new rl7() { // from class: o.ty6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return fz6.m27804r(list, (l1) obj);
            }
        });
    }

    /* renamed from: q */
    public static /* synthetic */ List m27803q(ArrayList arrayList) {
        return arrayList;
    }

    /* renamed from: r */
    public static /* synthetic */ x8c m27804r(List list, final l1 l1Var) {
        return x6c.e0((List) list.stream().map(new Function() { // from class: o.uy6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l1Var.Kl((String) obj);
            }
        }).collect(Collectors.toList())).d0(new az6()).m55733m(new ArrayList(), new wy6()).m55027y().d0(new rl7() { // from class: o.vy6
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return fz6.m27803q((ArrayList) obj);
            }
        });
    }

    /* renamed from: s */
    public static /* synthetic */ boolean m27805s(String str, String str2, fileObjectRelationship fileobjectrelationship) {
        final UploadedFile file = fileobjectrelationship.getFile();
        Optional map = Optional.ofNullable(str).filter(new Predicate() { // from class: o.dz6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return fz6.m27808v((String) obj);
            }
        }).map(new Function() { // from class: o.ez6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fz6.m27809w(file, (String) obj);
            }
        });
        Boolean bool = Boolean.TRUE;
        return Boolean.valueOf(((Boolean) map.orElse(bool)).booleanValue() && ((Boolean) Optional.ofNullable(str2).filter(new Predicate() { // from class: o.ry6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return fz6.m27810x((String) obj);
            }
        }).map(new Function() { // from class: o.sy6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fz6.m27811y(file, (String) obj);
            }
        }).orElse(bool)).booleanValue()).booleanValue();
    }

    /* renamed from: t */
    public static /* synthetic */ x8c m27806t(String str, final String str2, final String str3, l1 l1Var) {
        return l1Var.Jv(str).m55714J(new ggd() { // from class: o.zy6
            @Override // p001o.ggd
            public final boolean test(Object obj) {
                return fz6.m27805s(str2, str3, (fileObjectRelationship) obj);
            }
        }).d0(new az6());
    }

    /* renamed from: u */
    public static /* synthetic */ List m27807u(ArrayList arrayList) {
        return arrayList;
    }

    /* renamed from: v */
    public static /* synthetic */ boolean m27808v(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: w */
    public static /* synthetic */ Boolean m27809w(UploadedFile uploadedFile, String str) {
        return Boolean.valueOf(Objects.equals(str, uploadedFile.getDocumentCategory()));
    }

    /* renamed from: x */
    public static /* synthetic */ boolean m27810x(String str) {
        return !StringUtils.isBlank(str);
    }

    /* renamed from: y */
    public static /* synthetic */ Boolean m27811y(UploadedFile uploadedFile, String str) {
        return Boolean.valueOf(Objects.equals(str, uploadedFile.getDocumentSubCategory()));
    }

    /* renamed from: z */
    public static /* synthetic */ x6c m27812z(l1 l1Var, String str, String str2, FileObjectRelationshipSummary fileObjectRelationshipSummary) {
        return l1Var.ui(str, null, null, str2, fileObjectRelationshipSummary.getFileId(), fileObjectRelationshipSummary.getParentObjectId(), fileObjectRelationshipSummary.getParentObjectType(), fileObjectRelationshipSummary.getFieldName(), fileObjectRelationshipSummary.getInputContext());
    }
}
