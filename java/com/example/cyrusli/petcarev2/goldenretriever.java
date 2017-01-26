package com.example.cyrusli.petcarev2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cyrusli on 17/9/16.
 */
public class goldenretriever extends Fragment {

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
                "Golden Retrievers shed profusely, especially in the spring and fall. Daily brushing will get some of the loose hair out of the coat, keeping it from settling on your clothing and all over your house. But if you live with a Golden, you'll have to get used to dog hair.\n" +
                "Golden Retrievers are family dogs; they need to live indoors with their human \"pack,\" and shouldn't spend hours alone in the backyard.\n" +
                "Golden Retrievers are active dogs who need 40-60 minutes of hard exercise daily. They thrive on obedience training, agility classes, and other canine activities, which are a great way to give your dog physical and mental exercise.\n" +
                "Although they're gentle and trustworthy with kids, Golden Retrievers are boisterous, large dogs that can accidentally knock over a small child.\n" +
                "Goldens love to eat, and will quickly become overweight if overfed. Limit treats, measure out your dog's daily kibble, and feed him in regular meals rather than leaving food out all the time.\n" +
                "\n" +
                "Vital Stats:\n" +
                "Breed Group: Sporting Dogs\n" +
                "Height: 1 foot, 9 inches to 2 feet tall at the shoulder\n" +
                "Weight: 55 to 75 pounds\n" +
                "Life Span: 10 to 12 years\n" +
                "\n" +
                "Health:\n" +
                "Hip Dysplasia: Hip dyplasia is a heritable condition in which the thighbone doesn't fit snugly into the hip joint. Some dogs show pain and lameness on one or both rear legs, but you may not notice any signs of discomfort in a dog with hip dysplasia. As the dog ages, arthritis can develop. X-ray screening for hip dysplasia is done by the Orthopedic Foundation for Animals or the University of Pennsylvania Hip Improvement Program. Dogs with hip dysplasia should not be bred. If you're buying a puppy, ask the breeder for proof that the parents have been tested for hip dysplasia and are free of problems.\n" +
                "\n" +
                "Elbow Dysplasia: This is a heritable condition common to large-breed dogs. It's thought to be caused by different growth rates of the three bones that make up the dog's elbow, causing joint laxity. This can lead to painful lameness. Your vet may recommend surgery to correct the problem or medication to control the pain.\n" +
                "\n" +
                "Cataracts: As in humans, canine cataracts are characterized by cloudy spots on the eye lens that can grow over time. They may develop at any age, and often don't impair vision, although some cases cause severe vision loss. Breeding dogs should be examined by a board-certified veterinary ophthamologist to be certified as free of hereditary eye disease before they're bred. Cataracts can usually be surgically removed with good results.\n" +
                "\n" +
                "Progressive Retinal Atrophy (PRA): PRA is a family of eye diseases that involves the gradual deterioration of the retina. Early in the disease, dogs become night-blind. As the disease progresses, they lose their daytime vision as well. Many dogs adapt to limited or complete vision loss very well, as long as their surroundings remain the same.\n" +
                "\n" +
                "Subvalvular Aortic Stenosis: This heart problem is caused by a narrow connection between the left ventricle (out-flow) and the aorta. It can cause fainting and even sudden death. Your vet can detect it and prescribe the proper treatment.\n" +
                "\n" +
                "Osteochondrosis Dissecans (OCD): This orthopedic condition, caused by improper growth of cartilage in the joints, usually occurs in the elbows, but it has been seen in the shoulders as well. It causes a painful stiffening of the joint, to the point that the dog is unable to bend his elbow. It can be detected in dogs as early as four to nine months of age. Overfeeding of \"growth formula\" puppy foods or high-protein foods may contribute to its development.\n" +
                "\n" +
                "Allergies: Golden Retrievers can be allergic to a variety of substances, ranging from food to pollen. If your Golden is licking his paws or rubbing his face a great deal, have him checked by your vet.\n" +
                "\n" +
                "Von Willebrand's Disease: This is an inherited blood disorder that interferes with the blood's ability to clot. The main symptom is excessive bleeding after an injury or surgery. Other symptoms include nosebleeds, bleeding gums, or bleeding in the stomach or intestines. There is no cure, and a blood transfusion from the blood of normal dogs is currently the only treatment. Research is underway for new treatments, including medication. Most dogs with von Willebrand's disease can lead normal lives. A vet can test your dog for the condition. Dogs with this condition should not be bred.\n" +
                "\n" +
                "Gastric Dilatation-Volvulus: Commonly called bloat, this is a life-threatening condition that affects large, deep-chested dogs like Golden Retrievers, especially if they're fed one large meal a day, eat rapidly, or drink large amounts of water or exercise vigorously after eating. Bloat occurs when the stomach is distended with gas or air and then twists. The dog is unable to belch or vomit to rid himself of the excess air in his stomach, and blood flow to the heart is impeded. Blood pressure drops and the dog goes into shock. Without immediate medical attention, the dog can die.\n" +
                "Suspect bloat if your dog has a distended abdomen, is drooling excessively, and retching without throwing up. He also may be restless, depressed, lethargic, and weak with a rapid heart rate. If you notice these symptoms, get your dog to the vet as soon as possible.\n" +
                "\n" +
                "Epilepsy: Epilepsy is a brain disorder that causes periodic seizures and convulsions. Your vet will need to know how severe the seizures are and how often they occur to determine what medication to prescribe, if any.\n" +
                "\n" +
                "Hypothyroidism: This is a disorder of the thyroid gland that's thought to cause conditions such as epilepsy, hair loss, obesity, lethargy, dark patches on the skin, and other skin conditions. It's treated with medication and diet.\n" +
                "\n" +
                "Hemangiosarcoma: This is a very dangerous form of cancer that originates in the lining of blood vessels and spleen. It most commonly occurs in middle-age and elderly dogs.\n" +
                "\n" +
                "Osteosarcoma: Osteosarcoma is a malignant bone cancer that's common in large and giant breeds.\n" +
                "\n" +
                "Feeding:\n" +
                "Recommended daily amount: 2 to 3 cups of high-quality dry food a day, divided into two meals.\n" +
                "\n" +
                "NOTE: How much your adult dog eats depends on his size, age, build, metabolism, and activity level. Dogs are individuals, just like people, and they don't all need the same amount of food. It almost goes without saying that a highly active dog will need more than a couch potato dog. The quality of dog food you buy also makes a difference — the better the dog food, the further it will go toward nourishing your dog and the less of it you'll need to shake into your dog's bowl.\n" +
                "\n" +
                "Keep your Golden in good shape by measuring his food and feeding him twice a day rather than leaving food out all the time. If you're unsure whether he's overweight, give him the eye test and the hands-on test.\n" +
                "\n" +
                "First, look down at him. You should be able to see a waist. Then place your hands on his back, thumbs along the spine, with the fingers spread downward. You should be able to feel but not see his ribs without having to press hard. If you can't, he needs less food and more exercise.\n" +
                "\n" +
                "You'll need to take special care if you're raising a Golden puppy. These dogs grow very rapidly between the age of four and seven months, making them susceptible to bone disorders. They do well on a high-quality, low-calorie diet that keeps them from growing too fast.");

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(info);
    }

}