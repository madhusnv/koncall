package ai.salesmax.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import java.io.File;
import p001o.cv1;
import p001o.dv1;
import p001o.fn0;
import p001o.gn0;
import p001o.h84;
import p001o.h96;
import p001o.i96;
import p001o.id5;
import p001o.jgg;
import p001o.leg;
import p001o.n64;
import p001o.nl7;
import p001o.q83;
import p001o.qm1;
import p001o.r83;
import p001o.rq;
import p001o.sq;
import p001o.sq8;
import p001o.ta6;
import p001o.ua6;
import p001o.uia;
import p001o.uq8;
import p001o.vha;
import p001o.wre;
import p001o.xha;
import p001o.y3i;

@Database(entities = {h96.class, q83.class, ta6.class, vha.class, rq.class, cv1.class, fn0.class}, exportSchema = false, version = 18)
/* loaded from: classes.dex */
public abstract class SalesmaxDatabase extends RoomDatabase {

    /* renamed from: a */
    public static final C0075a f305a = new C0075a(null);

    /* renamed from: b */
    public static volatile SalesmaxDatabase f306b;

    /* renamed from: c */
    public static File f307c;

    /* renamed from: ai.salesmax.database.SalesmaxDatabase$a */
    public static final class C0075a {
        public C0075a() {
        }

        public /* synthetic */ C0075a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final SalesmaxDatabase m233a(Context context) {
            sq8.m48649h(context, "context");
            SalesmaxDatabase salesmaxDatabase = SalesmaxDatabase.f306b;
            if (salesmaxDatabase == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    sq8.m48648g(applicationContext, "getApplicationContext(...)");
                    salesmaxDatabase = (SalesmaxDatabase) Room.databaseBuilder(applicationContext, SalesmaxDatabase.class, "ai.salesmax").fallbackToDestructiveMigration().addCallback(new C0076b()).build();
                    SalesmaxDatabase.f306b = salesmaxDatabase;
                    SalesmaxDatabase.f307c = context.getDatabasePath("ai.salesmax");
                }
            }
            return salesmaxDatabase;
        }
    }

    /* renamed from: ai.salesmax.database.SalesmaxDatabase$b */
    public static final class C0076b extends RoomDatabase.Callback {

        /* renamed from: ai.salesmax.database.SalesmaxDatabase$b$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f308a;

            /* renamed from: b */
            public final /* synthetic */ leg f309b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(leg legVar, n64 n64Var) {
                super(2, n64Var);
                this.f309b = legVar;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(this.f309b, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.f308a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                this.f309b.execSQL("INSERT OR IGNORE INTO app_version (id) VALUES (1)");
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        @Override // androidx.room.RoomDatabase.Callback
        public void onOpen(leg legVar) {
            sq8.m48649h(legVar, "db");
            super.onOpen(legVar);
            uia.m51627b(uia.f48971a, "salesmax-database", "Making default entry in database for app version", null, null, 12, null);
            qm1.m45641b(null, new a(legVar, null), 1, null);
        }
    }

    /* renamed from: d */
    public abstract sq mo226d();

    /* renamed from: e */
    public abstract gn0 mo227e();

    /* renamed from: f */
    public abstract dv1 mo228f();

    /* renamed from: g */
    public abstract r83 mo229g();

    /* renamed from: h */
    public abstract i96 mo230h();

    /* renamed from: i */
    public abstract ua6 mo231i();

    /* renamed from: j */
    public abstract xha mo232j();
}
