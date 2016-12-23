import spock.lang.Specification

/**
 * Created by java on 23.12.2016.
 */
class CoinTest extends Specification {

    def 'should create coin with negative diameter and throw CoinLogicException'() {

        when: 'pass negative diameter'
        new Coin(weight, diameter);

        then:
        thrown CoinLogicException

        where:
        weight << 12
        diameter << -1
    }

    def 'should create coin with positive diameter'() {
        expect: 'pass negative diameter'
        new Coin(weight, diameter) != null

        where:
        weight << 12
        diameter << 5
    }
}
