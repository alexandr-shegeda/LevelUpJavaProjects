import spock.lang.Specification

import static junit.framework.Assert.assertEquals


/**
 * Created by java on 16.12.2016.
 */
class AListSpockTest extends Specification {


    def 'check is add element correct'() {
        given: 'initialize AList'
        AList list = new AList();
        int exp = 1;

        when: 'Try to add one element'
        list.add(5)

        int act = list.size()

        then: 'Check list size'
        assertEquals(exp, act)

//        where:
//        num << [0, 5, 7, 256]
    }

}
