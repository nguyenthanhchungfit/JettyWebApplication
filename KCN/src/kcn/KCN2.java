/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcn;

import kyotocabinet.*;
import static kyotocabinet.Visitor.NOP;

/**
 *
 * @author cpu11165-local
 */
public class KCN2 {

    public static void main(String[] args) {

        // create the object
        DB db = new DB();

        // open the database
        if (!db.open("casket.kch", DB.OREADER)) {
            System.err.println("open error: " + db.error());
        }

        // define the visitor
        class VisitorImpl implements Visitor {

            @Override
            public byte[] visit_full(byte[] key, byte[] value) {
                System.out.println(new String(key) + ":" + new String(value));
                return NOP;
            }

            @Override
            public byte[] visit_empty(byte[] key) {
                System.err.println(new String(key) + " is missing");
                return NOP;
            }

        }
        Visitor visitor = new VisitorImpl();

        // retrieve a record with visitor
        if (!db.accept("foo".getBytes(), visitor, false)
                || !db.accept("dummy".getBytes(), visitor, false)) {
            System.err.println("accept error: " + db.error());
        }

        // traverse records with visitor
        if (!db.iterate(visitor, false)) {
            System.err.println("iterate error: " + db.error());
        }

        // close the database
        if (!db.close()) {
            System.err.println("close error: " + db.error());
        }

    }
}
