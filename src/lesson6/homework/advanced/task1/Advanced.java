package lesson6.homework.advanced.task1;

public class Advanced {
    public static void main(String[] args) {

        Spruce spruce = new Spruce("ель");
        Pine pine = new Pine("сосна");
        Rose rose = new Rose("роза");
        Fern fern = new Fern("папоротник");

        CanSmell[] canSmells = {spruce, pine, rose};
        for (CanSmell canSmell: canSmells){
            canSmell.canSmell();
        }

        MayBloom[] mayBlooms = {rose, fern};
        for (MayBloom mayBloom: mayBlooms){
            mayBloom.bloom();
        }
    }
}
