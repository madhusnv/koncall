package p001o;

import com.amazonaws.amplify.generated.graphql.GetCustomValueQuery;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.CustomValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface pj4 extends me1 {
    static /* synthetic */ void Rr(g57 g57Var, List list, ryh ryhVar) {
        List list2 = (List) ryhVar.f44265a;
        Objects.requireNonNull(g57Var);
        list2.forEach(new ij4(g57Var));
        Optional optionalOfNullable = Optional.ofNullable((String) ryhVar.f44266b);
        Objects.requireNonNull(list);
        optionalOfNullable.ifPresent(new hqd(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default CustomValue Sj(GetCustomValueQuery.Data data) {
        return (CustomValue) sf(data.getCustomValue(), CustomValue.class);
    }

    static /* synthetic */ void Tm(List list, CompletableFuture completableFuture) {
        if (list.isEmpty()) {
            completableFuture.complete("");
        } else {
            completableFuture.complete((String) list.remove(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void Ub(final rl7 rl7Var, final g57 g57Var) {
        final f3e f3eVarN0 = f3e.N0();
        gu3 gu3Var = new gu3() { // from class: o.lj4
            @Override // p001o.gu3
            public final void accept(Object obj) {
                this.f33914a.fb(rl7Var, g57Var, f3eVarN0, (String) obj);
            }
        };
        Objects.requireNonNull(g57Var);
        f3eVarN0.w0(gu3Var, new mj4(g57Var), new nj4(g57Var));
        f3eVarN0.mo16560e("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default void fb(rl7 rl7Var, g57 g57Var, final f3e f3eVar, String str) {
        if (StringUtils.isBlank(str)) {
            str = null;
        }
        se((s47) rl7Var.apply(str), g57Var).thenAccept(new Consumer() { // from class: o.oj4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                pj4.iz(f3eVar, (String) obj);
            }
        });
    }

    static /* synthetic */ void iz(f3e f3eVar, String str) {
        if (StringUtils.isBlank(str)) {
            f3eVar.onComplete();
        } else {
            f3eVar.mo16560e(str);
        }
    }

    default x6c Rs(String str, String str2) {
        return m43763S(str, str2);
    }

    /* renamed from: S */
    default x6c m43763S(String str, String str2) {
        return graphqlQuery(GetCustomValueQuery.builder().accountId(on()).propertyDefinitionId(str2).parentObjectId(str).build(), GetCustomValueQuery.Data.class, new Function() { // from class: o.jj4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f30503a.Sj((GetCustomValueQuery.Data) obj);
            }
        }, CustomValue.class);
    }

    default s47 k1(final rl7 rl7Var) {
        return s47.m47679v(new y57() { // from class: o.kj4
            @Override // p001o.y57
            /* renamed from: a */
            public final void mo20510a(g57 g57Var) {
                this.f32295a.Ub(rl7Var, g57Var);
            }
        }, la1.BUFFER);
    }

    default CompletableFuture se(s47 s47Var, final g57 g57Var) {
        final ArrayList arrayList = new ArrayList();
        final CompletableFuture completableFuture = new CompletableFuture();
        s47Var.a0(new gu3() { // from class: o.fj4
            @Override // p001o.gu3
            public final void accept(Object obj) {
                pj4.Rr(g57Var, arrayList, (ryh) obj);
            }
        }, new gu3() { // from class: o.gj4
            @Override // p001o.gu3
            public final void accept(Object obj) {
                g57Var.onError((Throwable) obj);
            }
        }, new jm() { // from class: o.hj4
            @Override // p001o.jm
            public final void run() {
                pj4.Tm(arrayList, completableFuture);
            }
        });
        return completableFuture;
    }
}
