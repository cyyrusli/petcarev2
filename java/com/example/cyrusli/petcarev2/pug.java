package com.example.cyrusli.petcarev2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cyrusli on 18/9/16.
 */
public class pug extends Fragment {
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.doginfo, container, false);


        tv = (TextView) v.findViewById(R.id.info);
        loadText();


        return v;
    }
    private void loadText() {
        String info = new String("Exercise Needs: 4/5\n" +
                "Pugs are clowns at heart, but they carry themselves with dignity. Pugs are playful dogs, ready and able for games, but they are also lovers, and must be close to their humans. Pugs love to be the center of attention, and are heartsick if ignored.\n" +
                "\n" +
                "Pugs are square and thickset, usually weighing no more than 20 pounds. Their heads are large and round, with large, round eyes. They have deep and distinct wrinkles on their faces. Legend has it that the Chinese, who mastered the breeding of this dog, prized these wrinkles because they resembled good luck symbols in their language. Especially prized were dogs with wrinkles that seemed to form the letters for the word \"prince\" in Chinese.\n" +
                "\n" +
                "The moles on a Pug's cheeks are called \"beauty spots.\" His muzzle or mask is black, with a clearly defined \"thumb mark\" on the forehead and a black trace down the center of the back. His ears are smooth, black and velvety. He has a characteristic undershot jaw (the lower teeth extend slightly beyond the upper teeth) and a tightly curled tail.\n" +
                "\n" +
                "Personality-wise, Pugs are happy and affectionate, loyal and charming, playful and mischievous. They are very intelligent, however, they can be willful, which makes training challenging.\n" +
                "\n" +
                "While Pugs can be good watchdogs, they aren't inclined to be \"yappy,\" something your neighbors will appreciate. If trained and well-socialized, they get along well with other animals and children. Because they are a small, quiet breed and are relatively inactive when indoors, they are a good choice for apartment dwellers. Due to the flat shape of the Pug's face, he does not do well in extremely hot or cold weather, and should be kept indoors.\n" +
                "\n" +
                "Pugs have a short, double coat, and are known for shedding profusely. If you live with a Pug, it's a good idea to invest in a quality vacuum cleaner!\n" +
                "\n" +
                "Vital Stats:\n" +
                "Dog Breed Group: Companion Dogs\n" +
                "Height: 10 inches to 1 foot, 2 inches tall at the shoulder\n" +
                "Weight: 14 to 18 pounds\n" +
                "Life Span: 12 to 15 years\n" +
                "\n" +
                "Health:\n" +
                "Cheyletiella Dermatitis (Walking Dandruff): This is a skin condition that is caused by a small mite. If you see heavy dandruff, especially down the middle of the back, contact your vet. The mites that cause this condition are contagious, which means all pets in the household need to treated.\n" +
                "\n" +
                "Pug Dog Encephalitis: PDE is a fatal inflammatory brain disease that is unique to Pugs. Medical researchers don't know why Pugs develop this condition; there is no way test for it or to treat it. A diagnosis of PDE can only be made by testing the brain tissue of the dog after it dies. PDE usually affects young dogs, causing them to seizure, circle, become blind, then fall into a coma and die. This can happen in a few days or weeks. Since PDE seems to have a genetic component, the Pug Dog Club of America, along with the American Kennel Club Canine Health Foundation, is sponsoring research projects to try to learn more about this devastating disease.\n" +
                "\n" +
                "Epilepsy: PDE isn't the only thing that can cause Pugs to seizure. They are prone to a condition called idiopathic epilepsy: seizures for no known reason. If your Pug has seizures, take him to your vet to determine what treatment is appropriate.\n" +
                "\n" +
                "Nerve Degeneration: Older Pugs that drag their rear, stagger, have trouble jumping up or down, or become incontinent may be suffering from nerve degeneration. Pugs affected with this condition don't appear to be in pain and the condition usually advances slowly. Researchers aren't sure why it occurs. Since their front legs often remain strong, some owners buy carts to help their Pugs get around, and the veterinarian might be able to prescribe medication to help alleviate symptoms.\n" +
                "\n" +
                "Corneal Ulcers: Because his eyes are so large and prominent, the Pug's eyes can be injured easily or develop ulcers on the cornea (the clear part of the eye). If your Pug squints or the eyes look red and tear excessively, contact your vet immediately. Corneal ulcers usually respond well to medication, but if left untreated, can cause blindness or even rupture the eye.\n" +
                "\n" +
                "Dry Eye: Keratoconjunctivitis sicca and pigmentary keratitis are two conditions seen in Pugs. They can occur at the same time, or individually. Dry eye is caused when the eyes don't produce enough tears to stay moist. Your vet can perform tests to determine if this is the cause, which can be controlled with medication and special care. Pigmentary keratits is a condition that causes black spots on the cornea, especially in the corner near the nose. If the pigment covers the eye, it can cause blindness. Your vet can prescribe medication that will help keep the eyes moist and dissolve the pigment. Both of these eye conditions require life-long therapy and care.\n" +
                "\n" +
                "Eye Problems: Because their large eyes bulge, Pugs are prone to a variety of eye problems, including proptosis (the eyeball is dislodged from the eye socket and the eyelid clamps behind it); distichiasis (an abnormal growth of eyelashes on the margin of the eye, resulting in the eyelashes rubbing against the eye); progressive retinal atrophy (a degenerative disease of the retinal visual cells that leads to blindness); and entropion (the eyelid, usually the lower lid, rolls inward, causing the hair on the lid to rub on the eye and irritate it).\n" +
                "\n" +
                "Allergies: Some Pugs suffer from a variety of allergies, ranging from contact to food allergies. If your Pug is licking at his paws or rubbing his face a great deal, suspect allergy and have him checked by your vet.\n" +
                "\n" +
                "Demodectic Mange: Also called demodicosis, all dogs carry a little passenger called a demodex mite. The mother dog passes this mite to her pups in their first few days of life. The mite can't be passed to humans or other dogs; only the mother passes mites to her pups. Demodex mites live in hair follicles and usually don't cause any problems. If your Pug has a weakened or compromised immune system, however, it can develop demodectic mange. Demodectic mange can be localized or generalized. In the localized form, patches of red, scaly, skin with hair loss appears on the head, neck and forelegs. It's thought of as a puppy disease, and often clears up on its own. Even so, you should take your dog to the vet because it can turn into the generalized form of demodectic mange. Generalized demodectic mange covers the entire body and affects older puppies and young adult dogs. The dog develops patchy skin, bald spots, and skin infections all over the body. The American Academy of Veterinary Dermatology recommends neutering or spaying all dogs that develop generalized demodectic mange because there is a genetic link.\n" +
                "\n" +
                "Staph Infection: Staph bacteria is commonly found on skin, but some dogs will develop pimples and infected hair follicles if their immune systems are stressed. The lesions can look like hives where there is hair; on areas without hair, the lesions can look like ringworm. You should contact your vet for appropriate treatment.\n" +
                "\n" +
                "Yeast Infection: If your Pug smells bad, is itchy and has blackened, thickened skin, he may have a yeast infection. It commonly affects the armpits, feet, groin, neck, and inside the ears. Your vet can prescribe medications to clear this up.\n" +
                "\n" +
                "Hemi-vertebrae: Short-nosed breeds, such as Pugs, Bulldogs and French Bulldogs, can have misshaped vertebrae. Sometimes, only a few of the vertebrae are affected and the dog is able to live a normal life. Others will stagger and display an uncoordinated, weak gait between 4 and 6 months of age. Some dogs get progressively worse and may even become paralyzed. The cause of the condition is unknown. Surgery can help.\n" +
                "\n" +
                "Hip Dysplasia: This malady affects small breeds as well as large breeds, including Pugs. Many factors, including genetics, environment and diet, are thought to contribute to this deformity of the hip joint. Affected Pugs are usually able to lead normal, healthy lives with proper veterinary attention.\n" +
                "\n" +
                "Legg-Perthes Disease: This is another disease involving the hip joint. Many toy breeds are prone to this condition. When your Pug has Legg-Perthes, the blood supply to the head of the femur (the large rear leg bone) is decreased, and the head of the femur that connects to the pelvis begins to disintegrate. Usually, the first signs of Legg-Perthes, limping and atrophy of the leg muscle, occur when puppies are 4 to 6 months old. The condition can be corrected with surgery to cut off the diseased femur so that it isn't attached to the pelvis any longer. The scar tissue that results from the surgery creates a false joint and the puppy is usually pain free.\n" +
                "\n" +
                "Patellar Luxation: The patella is the kneecap. Luxation means dislocation of an anatomical part (as a bone at a joint). Patellar luxation is when the knee joint (often of a hind leg) slides in and out of place, causing pain. This can be crippling, but many dogs lead relatively normal lives with this condition.\n" +
                "Vaccination Sensitivity: There are reports of Pugs suffering from sensitivity to routine vaccinations. Usually, symptoms include hives, facial swelling, soreness and lethargy. A dog that is sensitive to vaccines can develop complications or die, though this is rare. Watch your Pug carefully for a few hours after being vaccinated and call the vet if you notice anything unusual.\n" +
                "\n" +
                "Feeding:\n" +
                "Recommended daily amount: 1/2 to 1 cup of high-quality dry food a day, divided into two meals.\n" +
                "\n" +
                "Note: How much your adult dog eats depends on his size, age, build, metabolism, and activity level. Dogs are individuals, just like people, and they don't all need the same amount of food. It almost goes without saying that a highly active dog will need more than a couch potato dog. The quality of dog food you buy also makes a difference — the better the dog food, the further it will go toward nourishing your dog and the less of it you'll need to shake into your dog's bowl.\n" +
                "\n" +
                "While the Pug's first love is human attention, his second love is food. These dogs love to eat, eat, eat. This, combined with their small stature, puts them at risk for obesity. As a Pug owner, you must show great restraint. Do not indulge him with food. Feed appropriate portions, limit treats and encourage exercise.");

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(info);
    }

}