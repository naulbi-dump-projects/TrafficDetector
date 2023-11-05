package com.xk72.charles.gui.transaction.general;

import com.xk72.charles.gui.lib.treetable.DefaultTreeTableNode;
import com.xk72.charles.gui.lib.treetable.j;
import com.xk72.charles.lib.g;
import com.xk72.charles.lib.n;
import com.xk72.charles.model.I;
import com.xk72.charles.model.ModelNode;
import com.xk72.charles.model.Transaction;
import com.xk72.proxy.Fields;
import com.xk72.proxy.ProxyException;
import com.xk72.proxy.http.HttpFields;
import com.xk72.proxy.http.RemoteServerClosedConnectionException;
import com.xk72.proxy.ssl.SSLExtension;
import com.xk72.proxy.ssl.k;
import com.xk72.proxy.ssl.l;
import java.net.InetAddress;
import java.security.cert.Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;
import javax.swing.tree.MutableTreeNode;

public class i extends c {
    private static final String c = "-";
    protected DefaultTreeTableNode b = new DefaultTreeTableNode();
    private final com.xk72.charles.gui.lib.treetable.c d;
    private DefaultTreeTableNode e;
    private DefaultTreeTableNode f;
    private DefaultTreeTableNode g;
    private DefaultTreeTableNode h;
    private DefaultTreeTableNode i;
    private DefaultTreeTableNode j;
    private DefaultTreeTableNode k;
    private DefaultTreeTableNode l;
    private DefaultTreeTableNode m;
    private DefaultTreeTableNode n;
    private DefaultTreeTableNode o;
    private DefaultTreeTableNode p;
    private DefaultTreeTableNode q;
    private DefaultTreeTableNode r;
    private DefaultTreeTableNode s;
    private DefaultTreeTableNode t;
    private DefaultTreeTableNode u;
    private DefaultTreeTableNode v;
    private DefaultTreeTableNode w;
    private DefaultTreeTableNode x;
    private DefaultTreeTableNode y;
    private DefaultTreeTableNode z;
    private DefaultTreeTableNode A;
    private DefaultTreeTableNode B;
    private DefaultTreeTableNode C;
    private DefaultTreeTableNode D;
    private DefaultTreeTableNode E;
    private DefaultTreeTableNode F;
    private DefaultTreeTableNode G;
    private DefaultTreeTableNode H;
    private DefaultTreeTableNode I;
    private DefaultTreeTableNode J;
    private DefaultTreeTableNode K;
    private DefaultTreeTableNode L;
    private DefaultTreeTableNode M;
    private DefaultTreeTableNode N;
    private DefaultTreeTableNode O;
    private DefaultTreeTableNode P;
    private DefaultTreeTableNode Q;
    private DefaultTreeTableNode R;
    private DefaultTreeTableNode S;
    private DefaultTreeTableNode T;
    private DefaultTreeTableNode U;
    private DefaultTreeTableNode V;
    private DefaultTreeTableNode W;
    private DefaultTreeTableNode X;
    private DefaultTreeTableNode Y;
    private DefaultTreeTableNode Z;
    private DefaultTreeTableNode aa;
    private DefaultTreeTableNode ab;
    private DefaultTreeTableNode ac;
    private DefaultTreeTableNode ad;
    private DefaultTreeTableNode ae;
    private DefaultTreeTableNode af;
    private DefaultTreeTableNode ag;
    private DefaultTreeTableNode ah;
    private DefaultTreeTableNode ai;
    private DefaultTreeTableNode aj;
    private DefaultTreeTableNode ak;
    private DefaultTreeTableNode al;
    private DefaultTreeTableNode am;
    private DefaultTreeTableNode an;
    private DefaultTreeTableNode ao;
    private DefaultTreeTableNode ap;
    private DefaultTreeTableNode aq;
    private DefaultTreeTableNode ar;
    private DefaultTreeTableNode as;
    private DefaultTreeTableNode at;
    private DefaultTreeTableNode au;
    private DefaultTreeTableNode av;
    private DefaultTreeTableNode aw;
    private DefaultTreeTableNode ax;
    private DefaultTreeTableNode ay;
    private DefaultTreeTableNode az;
    private DefaultTreeTableNode aA;
    private DefaultTreeTableNode aB;
    private DefaultTreeTableNode aC;
    private DefaultTreeTableNode aD;

    public i() {
        this.d = new com.xk72.charles.gui.lib.treetable.c(this.b);
        this.d.a("Name");
        this.d.a("Value", String.class);
        this.c();
    }

    public j b() {
        return this.d;
    }

    protected void c() {
        this.b.add(this.e = new DefaultTreeTableNode("URL"));
        this.b.add(this.g = new DefaultTreeTableNode("Status"));
        this.b.add(this.h = new DefaultTreeTableNode("Failure"));
        this.b.add(this.f = new DefaultTreeTableNode("Notes"));
        this.b.add(this.i = new DefaultTreeTableNode("Response Code"));
        this.b.add(this.j = new DefaultTreeTableNode("Protocol"));
        this.b.add(this.k = new DefaultTreeTableNode("TLS"));
        this.k.add(this.q = new DefaultTreeTableNode("Protocol"));
        this.q.add(this.s = new DefaultTreeTableNode("Client Supported"));
        this.q.add(this.t = new DefaultTreeTableNode("Charles to Client"));
        this.q.add(this.r = new DefaultTreeTableNode("Server Chosen"));
        this.k.add(this.J = new DefaultTreeTableNode("Alert Code"));
        this.k.add(this.l = new DefaultTreeTableNode("Session Resumed"));
        this.l.add(this.m = new DefaultTreeTableNode("Client Requested"));
        this.l.add(this.o = new DefaultTreeTableNode("Client Session ID"));
        this.l.add(this.p = new DefaultTreeTableNode("Charles Requested"));
        this.l.add(this.n = new DefaultTreeTableNode("Server Session ID"));
        this.k.add(this.u = new DefaultTreeTableNode("Cipher Suite"));
        this.u.add(this.v = new DefaultTreeTableNode("Client Supported"));
        this.u.add(this.x = new DefaultTreeTableNode("Charles to Client"));
        this.u.add(this.w = new DefaultTreeTableNode("Server Chosen"));
        this.k.add(this.y = new DefaultTreeTableNode("ALPN"));
        this.y.add(this.z = new DefaultTreeTableNode("Client Supported"));
        this.y.add(this.A = new DefaultTreeTableNode("Charles Supported"));
        this.y.add(this.B = new DefaultTreeTableNode("Server Chosen"));
        this.k.add(this.C = new DefaultTreeTableNode("Client Certificates"));
        this.k.add(this.D = new DefaultTreeTableNode("Server Certificates"));
        this.k.add(this.E = new DefaultTreeTableNode("Extensions"));
        this.E.add(this.F = new DefaultTreeTableNode("Client"));
        this.E.add(this.G = new DefaultTreeTableNode("Charles to Client"));
        this.E.add(this.H = new DefaultTreeTableNode("Charles to Server"));
        this.E.add(this.I = new DefaultTreeTableNode("Server"));
        this.b.add(this.K = new DefaultTreeTableNode("Method"));
        this.b.add(this.as = new DefaultTreeTableNode("Kept Alive"));
        this.b.add(this.L = new DefaultTreeTableNode("Content-Type"));
        this.b.add(this.M = new DefaultTreeTableNode("Client Address"));
        this.b.add(this.N = new DefaultTreeTableNode("Remote Address"));
        this.b.add(this.au = new DefaultTreeTableNode("Tags"));
        this.b.add(this.at = new DefaultTreeTableNode("Connection"));
        this.av = new DefaultTreeTableNode("WebSockets");
        this.av.add(this.aw = new DefaultTreeTableNode("Origin"));
        this.av.add(this.ax = new DefaultTreeTableNode("Version"));
        this.av.add(this.ay = new DefaultTreeTableNode("Protocol"));
        this.av.add(this.az = new DefaultTreeTableNode("Extensions"));
        this.av.add(this.aA = new DefaultTreeTableNode("Messages Sent"));
        this.av.add(this.aB = new DefaultTreeTableNode("Messages Received"));
        this.av.add(this.aC = new DefaultTreeTableNode("Control Frames Sent"));
        this.av.add(this.aD = new DefaultTreeTableNode("Control Frames Received"));
        this.b.add(this.av);
        DefaultTreeTableNode var1 = new DefaultTreeTableNode("Timing");
        var1.add(this.O = new DefaultTreeTableNode("Request Start Time"));
        var1.add(this.P = new DefaultTreeTableNode("Request End Time"));
        var1.add(this.Q = new DefaultTreeTableNode("Response Start Time"));
        var1.add(this.R = new DefaultTreeTableNode("Response End Time"));
        var1.add(this.ae = new DefaultTreeTableNode("Duration"));
        var1.add(this.ag = new DefaultTreeTableNode("DNS"));
        var1.add(this.ah = new DefaultTreeTableNode("Connect"));
        var1.add(this.ai = new DefaultTreeTableNode("TLS Handshake"));
        var1.add(this.aj = new DefaultTreeTableNode("Request"));
        var1.add(this.ak = new DefaultTreeTableNode("Response"));
        var1.add(this.af = new DefaultTreeTableNode("Latency"));
        var1.add(this.al = new DefaultTreeTableNode("Speed"));
        var1.add(this.am = new DefaultTreeTableNode("Request Speed"));
        var1.add(this.an = new DefaultTreeTableNode("Response Speed"));
        this.b.add(var1);
        DefaultTreeTableNode var2 = new DefaultTreeTableNode("Size");
        var2.add(this.S = new DefaultTreeTableNode("Request"));
        this.S.add(this.W = new DefaultTreeTableNode("TLS Handshake"));
        this.S.add(this.U = new DefaultTreeTableNode("Header"));
        this.S.add(this.Y = new DefaultTreeTableNode("Query String"));
        this.S.add(this.Z = new DefaultTreeTableNode("Cookies"));
        this.S.add(this.aa = new DefaultTreeTableNode("Body"));
        this.S.add(this.aq = new DefaultTreeTableNode("Uncompressed Body"));
        this.S.add(this.ao = new DefaultTreeTableNode("Compression"));
        var2.add(this.T = new DefaultTreeTableNode("Response"));
        this.T.add(this.X = new DefaultTreeTableNode("TLS Handshake"));
        this.T.add(this.V = new DefaultTreeTableNode("Header"));
        this.T.add(this.ab = new DefaultTreeTableNode("Cookies"));
        this.T.add(this.ac = new DefaultTreeTableNode("Body"));
        this.T.add(this.ar = new DefaultTreeTableNode("Uncompressed Body"));
        this.T.add(this.ap = new DefaultTreeTableNode("Compression"));
        var2.add(this.ad = new DefaultTreeTableNode("Total"));
        this.b.add(var2);
    }

    public void a(ModelNode[] var1) {
        this.a((Transaction)var1[0]);
    }

    private void a(Transaction var1) {
        this.e.setValue(var1.toString());
        //Logger.getLogger("com.xk72.charles.CharlesContext").info("Transcation URL: " + var1.toString());
        this.j.setValue(var1.getProtocolVersion());
        String var2;
        DefaultTreeTableNode var10000;
        String var10001;
        if (var1.getSslProtocol() != null) {
            var10000 = this.k;
            var10001 = var1.getSslProtocol();
            var10000.setValue(var10001 + " (" + var1.getCipherSuite() + ")");
            this.l.setValue(this.b(var1));
            this.m.setValue(com.xk72.charles.gui.transaction.general.d.a(var1.getClientProposedSslSessionID()));
            this.n.setValue(com.xk72.charles.gui.transaction.general.d.a(var1.getSslSessionID()));
            if (var1.getClientSslSessionID() == null && var1.getProposedSslSessionID() == null) {
                this.m.setName("Requested");
                this.d.a(this.m);
                this.n.setName("Session ID");
                this.d.a(this.n);
                this.a(this.o);
                this.a(this.p);
            } else {
                this.m.setName("Client Requested");
                this.d.a(this.m);
                this.n.setName("Server Session ID");
                this.d.a(this.n);
                this.a(this.l, this.o, this.m);
                this.o.setValue(com.xk72.charles.gui.transaction.general.d.a(var1.getClientSslSessionID()));
                this.a(this.l, this.p, this.o);
                this.p.setValue(com.xk72.charles.gui.transaction.general.d.a(var1.getProposedSslSessionID()));
            }

            this.q.setValue(var1.getSslProtocol());
            this.s.setValue(this.a((Object)var1.getClientProposedSslProtocol()));
            this.r.setValue(var1.getSslProtocol());
            this.a(this.q, this.t, this.r, var1.getClientSslProtocol());
            this.a(this.k, this.J, this.q, this.a(var1.getSslAlert()));
            this.u.setValue(var1.getCipherSuite());
            this.v.setValue(var1.getClientProposedCipherSuites());
            this.w.setValue(var1.getCipherSuite());
            this.a(this.u, this.x, this.w, var1.getClientCipherSuite());
            this.y.setValue(this.a((Object)var1.getAlpnProtocol()));
            this.z.setValue(this.a((Object)var1.getClientProposedAlpnProtocols()));
            this.B.setValue(this.a((Object)var1.getAlpnProtocol()));
            this.a(this.y, this.A, this.B, var1.getProposedAlpnProtocols());
        } else if (var1.getClientProposedSslProtocol() != null) {
            var2 = this.a(var1.getSslAlert());
            var10000 = this.k;
            var10001 = var1.getClientProposedSslProtocol();
            var10000.setValue(var10001 + (var2 == null ? "" : " [Failed: " + var2 + "]"));
            this.l.setValue("-");
            this.m.setValue(com.xk72.charles.gui.transaction.general.d.a(var1.getClientProposedSslSessionID()));
            this.a(this.o);
            this.a(this.p);
            this.n.setValue(com.xk72.charles.gui.transaction.general.d.a(var1.getSslSessionID()));
            this.q.setValue(var1.getClientProposedSslProtocol());
            this.s.setValue(var1.getClientProposedSslProtocol());
            this.r.setValue(this.a((Object)var1.getSslProtocol()));
            this.a(this.t);
            this.a(this.k, this.J, this.q, var2);
            this.u.setValue(this.a((Object)var1.getCipherSuite()));
            this.v.setValue(var1.getClientProposedCipherSuites());
            this.w.setValue(this.a((Object)var1.getCipherSuite()));
            this.a(this.x);
            this.y.setValue(this.a((Object)var1.getAlpnProtocol()));
            this.z.setValue(this.a((Object)var1.getClientProposedAlpnProtocols()));
            this.B.setValue(this.a((Object)var1.getAlpnProtocol()));
            this.a(this.A);
        } else {
            this.k.setValue("-");
            this.l.setValue("-");
            this.m.setValue("-");
            this.a(this.o);
            this.a(this.p);
            this.n.setValue("-");
            this.q.setValue("-");
            this.s.setValue("-");
            this.r.setValue("-");
            this.a(this.t);
            this.a(this.J);
            this.u.setValue("-");
            this.v.setValue("-");
            this.w.setValue("-");
            this.a(this.x);
            this.y.setValue("-");
            this.z.setValue("-");
            this.B.setValue("-");
            this.a(this.A);
        }

        this.K.setValue(var1.getMethod());
        if (var1.getKeptAlive() != null) {
            if (var1.getKeptAlive()) {
                this.as.setValue("Yes");
            } else if (Boolean.TRUE.equals(var1.getClientKeptAlive())) {
                this.as.setValue("No (Client connection kept alive)");
            } else {
                this.as.setValue("No");
            }
        } else {
            this.as.setValue("-");
        }

        if (var1.getStartTime() != null) {
            this.O.setValue(this.a((Date)var1.getStartTime()));
        } else {
            this.O.setValue("-");
        }

        if (var1.getResponseHeader() != null) {
            if (var1.getResponseHeader() instanceof HttpFields) {
                var2 = String.valueOf(((HttpFields)var1.getResponseHeader()).getResponseStatus());
                String var3 = ((HttpFields)var1.getResponseHeader()).getResponseStatusDescription();
                if (var3 != null) {
                    var2 = var2 + " " + var3;
                }

                this.i.setValue(var2);
            } else {
                this.i.setValue("-");
            }

            this.L.setValue(com.xk72.charles.lib.g.a(var1.getResponseHeader(), "-"));
        } else {
            this.i.setValue("-");
            this.L.setValue("-");
        }

        if (var1.getRequestCompleteTime() != null) {
            this.P.setValue(this.a((Date)var1.getRequestCompleteTime()));
        } else {
            this.P.setValue("-");
        }

        if (var1.getResponseBeginTime() != null) {
            this.Q.setValue(this.a((Date)var1.getResponseBeginTime()));
        } else {
            this.Q.setValue("-");
        }

        if (var1.getEndTime() != null) {
            this.R.setValue(this.a((Date)var1.getEndTime()));
        } else {
            this.R.setValue("-");
        }

        if (var1.getRemoteAddress() == null) {
            this.N.setValue("-");
        } else if (var1.getActualPort() < 0) {
            this.N.setValue(this.a(var1.getRemoteAddress()));
        } else {
            var10000 = this.N;
            var10001 = this.a(var1.getRemoteAddress());
            var10000.setValue(var10001 + ":" + var1.getActualPort());
        }

        if (var1.getClientAddress() == null) {
            this.M.setValue("-");
        } else if (var1.getClientPort() < 0) {
            this.M.setValue(this.a(var1.getClientAddress()));
        } else {
            var10000 = this.M;
            var10001 = this.a(var1.getClientAddress());
            var10000.setValue(var10001 + ":" + var1.getClientPort());
        }

        if (!var1.hasRequestBody() && var1.getRequestHeader() == null) {
            this.S.setValue("-");
        } else {
            this.S.setValue(this.a.d(var1.getTotalRequestSize()));
        }

        if (!var1.hasResponseBody() && var1.getResponseHeader() == null) {
            this.T.setValue("-");
        } else {
            this.T.setValue(this.a.d(var1.getTotalResponseSize()));
        }

        if (var1.getQuery() != null) {
            this.Y.setValue(this.a.d((long)Fields.byteLength(var1.getQuery())));
        } else {
            this.Y.setValue("-");
        }

        if (var1.hasRequestBody()) {
            this.aa.setValue(this.a.d(var1.getRequestSize()));
        } else {
            this.aa.setValue("-");
        }

        if (var1.hasResponseBody()) {
            this.ac.setValue(this.a.d(var1.getResponseSize()));
        } else {
            this.ac.setValue("-");
        }

        String[] var4;
        int var5;
        int var6;
        String var7;
        String[] var16;
        int var17;
        if (var1.getRequestHeader() != null) {
            if (var1.getRequestHeaderSize() == 0 && "CONNECT".equals(var1.getMethod())) {
                this.U.setValue("-");
            } else {
                this.U.setValue(this.a.d((long)var1.getRequestHeaderSize()));
            }

            var16 = var1.getRequestHeader().getFieldValues("Cookie");
            if (var16 != null) {
                var17 = 0;
                var4 = var16;
                var5 = var16.length;

                for(var6 = 0; var6 < var5; ++var6) {
                    var7 = var4[var6];
                    var17 += Fields.byteLength(var7);
                }

                this.Z.setValue(this.a.d((long)var17));
            } else {
                this.Z.setValue("-");
            }
        } else {
            this.U.setValue("-");
        }

        if (var1.getRequestHandshakeSize() == 0) {
            this.W.setValue("-");
        } else {
            this.W.setValue(this.a.d((long)var1.getRequestHandshakeSize()));
        }

        if (var1.getResponseHandshakeSize() == 0) {
            this.X.setValue("-");
        } else {
            this.X.setValue(this.a.d((long)var1.getResponseHandshakeSize()));
        }

        if (var1.getResponseHeader() != null) {
            if (var1.getResponseHeaderSize() == 0 && "CONNECT".equals(var1.getMethod())) {
                this.V.setValue("-");
            } else {
                this.V.setValue(this.a.d((long)var1.getResponseHeaderSize()));
            }

            var16 = var1.getResponseHeader().getFieldValues("Set-Cookie");
            if (var16 != null) {
                var17 = 0;
                var4 = var16;
                var5 = var16.length;

                for(var6 = 0; var6 < var5; ++var6) {
                    var7 = var4[var6];
                    var17 += Fields.byteLength(var7);
                }

                this.ab.setValue(this.a.d((long)var17));
            } else {
                this.ab.setValue("-");
            }
        } else {
            this.V.setValue("-");
        }

        long var18 = var1.getTotalSize();
        if (var18 > 0L) {
            this.ad.setValue(this.a.d(var18));
        } else {
            this.ad.setValue("-");
        }

        Long var19 = com.xk72.charles.model.I.a(var1, (Long)null);
        if (var19 != null) {
            this.ae.setValue(this.a.f(var19));
        } else {
            this.ae.setValue("-");
        }

        Long var20 = com.xk72.charles.model.I.e(var1, (Long)null);
        if (var20 != null) {
            this.al.setValue(this.a.a((float)var20));
        } else {
            this.al.setValue("-");
        }

        Long var21 = com.xk72.charles.model.I.g(var1, (Long)null);
        if (var21 != null) {
            this.am.setValue(this.a.a((float)var21));
        } else {
            this.am.setValue("-");
        }

        Long var22 = com.xk72.charles.model.I.f(var1, (Long)null);
        if (var22 != null) {
            this.an.setValue(this.a.a((float)var22));
        } else {
            this.an.setValue("-");
        }

        Long var8 = com.xk72.charles.model.I.b(var1, (Long)null);
        if (var8 != null) {
            this.af.setValue(this.a.f(var8));
        } else {
            this.af.setValue("-");
        }

        if (var1.getDnsDuration() != null) {
            this.ag.setValue(this.a.f(var1.getDnsDuration()));
        } else {
            this.ag.setValue("-");
        }

        if (var1.getConnectDuration() != null) {
            this.ah.setValue(this.a.f(var1.getConnectDuration()));
        } else {
            this.ah.setValue("-");
        }

        if (var1.getSslDuration() != null) {
            this.ai.setValue(this.a.f(var1.getSslDuration()));
        } else {
            this.ai.setValue("-");
        }

        Long var9 = com.xk72.charles.model.I.c(var1, (Long)null);
        if (var9 != null) {
            this.aj.setValue(this.a.f(var9));
        } else {
            this.aj.setValue("-");
        }

        Long var10 = com.xk72.charles.model.I.d(var1, (Long)null);
        if (var10 != null) {
            this.ak.setValue(this.a.f(var10));
        } else {
            this.ak.setValue("-");
        }

        long var11;
        if (var1.getRequestContentEncoding() != null) {
            var11 = var1.getDecodedRequestSize();
            var10000 = this.ao;
            var10001 = this.a(var1.getRequestSize(), var11);
            var10000.setValue(var10001 + " (" + var1.getRequestContentEncoding() + ")");
            this.aq.setValue(this.a.d(var11));
        } else {
            this.ao.setValue("-");
            this.aq.setValue("-");
        }

        if (var1.getResponseContentEncoding() != null) {
            var11 = var1.getDecodedResponseSize();
            var10000 = this.ap;
            var10001 = this.a(var1.getResponseSize(), var11);
            var10000.setValue(var10001 + " (" + var1.getResponseContentEncoding() + ")");
            this.ar.setValue(this.a.d(var11));
        } else {
            this.ap.setValue("-");
            this.ar.setValue("-");
        }

        this.g.setValue(Transaction.b(var1.getStatus()));
        this.a(this.b, this.h, this.g, this.a(var1.getException()));
        this.a(this.b, this.f, this.b.contains(this.h) ? this.h : this.g, var1.getNotes());
        if (Boolean.TRUE.equals(var1.getWebSocket())) {
            this.av.setValue(String.format("%d messages (%d sent, %d received)", var1.getMessagesSent() + var1.getMessagesReceived(), var1.getMessagesSent(), var1.getMessagesReceived()));
            Fields var23 = var1.getRequestHeader();
            this.aw.setValue(this.a((Object)var23.getField("Origin")));
            this.ax.setValue(this.a((Object)var23.getField("Sec-WebSocket-Version")));
            this.ay.setValue(this.a((Object)var23.getField("Sec-WebSocket-Protocol")));
            this.az.setValue(this.a((Object)var23.getField("Sec-WebSocket-Extensions")));
            this.aA.setValue(var1.getMessagesSent());
            this.aB.setValue(var1.getMessagesReceived());
            this.aC.setValue(var1.getControlFramesSent());
            this.aD.setValue(var1.getControlFramesReceived());
        } else {
            this.av.setValue("-");
            this.aw.setValue("-");
            this.ax.setValue("-");
            this.ay.setValue("-");
            this.az.setValue("-");
            this.aA.setValue("-");
            this.aB.setValue("-");
            this.aC.setValue("-");
            this.aD.setValue("-");
        }

        List var24 = var1.getClientCertificates();
        if (var24 != null && !var24.isEmpty()) {
            this.C.removeAllChildren();
            this.C.setValue(var24.size());
            Iterator var12 = var24.iterator();

            while(var12.hasNext()) {
                Certificate var13 = (Certificate)var12.next();
                this.C.add(com.xk72.charles.gui.transaction.general.d.a(var13, this.a));
            }

            this.d.b(this.C);
        } else {
            this.C.removeAllChildren();
            this.C.setValue("-");
            this.d.b(this.C);
        }

        List var25 = var1.getServerCertificates();
        if (var25 != null && !var25.isEmpty()) {
            this.D.removeAllChildren();
            this.D.setValue(var25.size());
            Iterator var26 = var25.iterator();

            while(var26.hasNext()) {
                Certificate var14 = (Certificate)var26.next();
                this.D.add(com.xk72.charles.gui.transaction.general.d.a(var14, this.a));
            }

            this.d.b(this.D);
        } else {
            this.D.removeAllChildren();
            this.D.setValue("-");
            this.d.b(this.D);
        }

        this.a(this.F, true, false, var1.getClientProposedExtensions());
        this.a(this.G, false, true, var1.getClientExtensions());
        this.a(this.H, true, true, var1.getProposedExtensions());
        this.a(this.I, false, false, var1.getServerExtensions());
        this.au.setValue(var1.getTags() == null ? "-" : var1.getTags());
        this.d.b();
        this.at.removeAllChildren();
        Map var27 = var1.getConnectionAttributes();
        if (var27 != null) {
            Iterator var28 = var27.entrySet().iterator();

            while(var28.hasNext()) {
                Entry var15 = (Entry)var28.next();
                this.at.add(new DefaultTreeTableNode((String)var15.getKey(), var15.getValue()));
            }
        }

        this.d.b(this.at);
    }

    private String b(Transaction var1) {
        if (var1.getClientSslSessionID() == null) {
            if (Boolean.TRUE.equals(var1.getKeptAlive())) {
                return "N/A (Connection kept alive)";
            } else if (var1.getSslSessionID() != null && var1.getSslSessionID().length > 0 && Arrays.equals(var1.getSslSessionID(), var1.getClientProposedSslSessionID())) {
                return "Yes";
            } else {
                return var1.getSslSessionID() != null && var1.getSslSessionID().length > 0 && Arrays.equals(var1.getSslSessionID(), var1.getProposedSslSessionID()) ? "Yes" : "No";
            }
        } else {
            boolean var2 = var1.getClientSslSessionID() != null && var1.getClientSslSessionID().length > 0 && Arrays.equals(var1.getClientSslSessionID(), var1.getClientProposedSslSessionID());
            boolean var3 = var1.getSslSessionID() != null && var1.getSslSessionID().length > 0 && Arrays.equals(var1.getSslSessionID(), var1.getProposedSslSessionID());
            if (Boolean.TRUE.equals(var1.getKeptAlive())) {
                return "N/A (Connection kept alive)";
            } else if (Boolean.TRUE.equals(var1.getClientKeptAlive())) {
                return var3 ? "Yes (Server session resumed, client connection kept alive)" : "No (Server session restarted, client connection kept alive)";
            } else if (var3) {
                return var2 ? "Yes" : "Yes (Server session resumed, client session restarted)";
            } else {
                return var2 ? "No (Client session resumed, server session restarted)" : "No";
            }
        }
    }

    private String a(InetAddress var1) {
        String var2 = var1.toString();
        return var2.startsWith("/") ? var2.substring(1) : var2;
    }

    private String a(byte var1) {
        if (var1 == 0) {
            return null;
        } else {
            l var2 = com.xk72.proxy.ssl.k.a(var1);
            return var2 == null ? "Unknown alert code (" + var1 + ")" : var2.b + " (" + var1 + ") - " + var2.c;
        }
    }

    private void a(DefaultTreeTableNode var1, boolean var2, boolean var3, List<SSLExtension> var4) {
        if (var4 != null && !var4.isEmpty()) {
            if (var3) {
                int var5 = this.E.getChildCount() - 1;
                this.a(this.E, var1, var5);
            }

            var1.removeAllChildren();
            var1.setValue(var4.size());
            Iterator var7 = var4.iterator();

            while(var7.hasNext()) {
                SSLExtension var6 = (SSLExtension)var7.next();
                var1.add(this.a(var6, var2));
            }

            this.d.b(var1);
        } else if (var3) {
            this.a(var1);
        } else {
            var1.setValue("-");
            var1.removeAllChildren();
            this.d.b(var1);
        }

    }

    private MutableTreeNode a(SSLExtension var1, boolean var2) {
        String var10000 = com.xk72.charles.gui.transaction.general.h.a(var1.getType(), var2);
        String var3 = var10000 + " (" + var1.getType() + ")";
        Object var4 = com.xk72.charles.gui.transaction.general.h.a(var1.getType(), var1.getData(), var2);
        DefaultTreeTableNode var5 = new DefaultTreeTableNode(var3, var4);
        return var5;
    }

    private String a(Exception var1) {
        if (var1 == null) {
            return null;
        } else {
            return !(var1 instanceof ProxyException) && !(var1 instanceof RemoteServerClosedConnectionException) ? com.xk72.charles.lib.n.a(var1) : var1.getMessage();
        }
    }

    private void a(DefaultTreeTableNode var1, DefaultTreeTableNode var2, DefaultTreeTableNode var3) {
        if (!var1.contains(var2)) {
            var1.insertChildAfter(var2, var3);
            this.d.a(var1.getPath(), new Object[]{var2});
        }

    }

    private void a(DefaultTreeTableNode var1, DefaultTreeTableNode var2, int var3) {
        if (!var1.contains(var2)) {
            var1.insert(var2, var3);
            this.d.a(var1.getPath(), new Object[]{var2});
        }

    }

    private void a(DefaultTreeTableNode var1) {
        DefaultTreeTableNode var2 = (DefaultTreeTableNode)var1.getParent();
        if (var2 != null) {
            int var3 = var2.indexOf(var1);
            if (var3 != -1) {
                var2.remove(var3);
                this.d.a(var2.getPath(), new int[]{var3}, new Object[]{var1});
            }
        }

    }

    private void a(DefaultTreeTableNode var1, DefaultTreeTableNode var2, DefaultTreeTableNode var3, Object var4) {
        if (var4 == null) {
            this.a(var2);
        } else {
            var2.setValue(var4);
            this.a(var1, var2, var3);
        }

    }

    private Object a(Object var1) {
        if (var1 == null) {
            return "-";
        } else {
            return var1 instanceof List ? var1 : var1.toString();
        }
    }

    public void a() {
    }
}
