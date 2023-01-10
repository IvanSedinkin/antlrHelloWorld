public class MyVisitor extends helloBaseVisitor<Object>{
    @Override public Object visitR(helloParser.RContext ctx) { return visitChildren(ctx); }
}
