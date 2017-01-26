package com.example.cyrusli.petcarev2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class cairnterrier extends Fragment {

    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle svedInstanceState) {
        View v = inflater.inflate(R.layout.doginfo, container, false);


        tv = (TextView) v.findViewById(R.id.info);
        loadText();


        return v;
    }
    private void loadText() {
        String info = new String("Cairn Terrier\n" +
                "The Cairn Terrier dog breed is a small working terrier developed on the Isle of Skye in Scotland. Farmers used him to rid their property of vermin, and they needed a dog with courage, tenacity, and intelligence — characteristics still found in today’s Cairn. He is a sensible, independent, and friendly dog who excels as a family companion.\n" +
                "If you've seen the movie The Wizard of Oz, you've seen one of the most famous Cairn Terriers ever. The dog who played Toto in the film was a female Cairn named Terry. Paid $125 per week for her role as Toto, she was owned by trainer Carl Spitz, and she had appeared in several movies prior to her famous role in Oz. She lived to be 11 years old.\n" +
                "The film character Toto is characteristically Cairn: a small, sturdy, shaggy-coated terrier who's highly intelligent and confident. The breed is alert and always ready for action.\n" +
                "The Cairn is also curious and quick to learn. And, like all terriers, he's independent and a bit stubborn. He must know who is in charge, or he will take charge. Early obedience training and socialization are essential.\n" +
                "In spite of his independent nature, the Cairn is a sensitive dog. His feelings are easily hurt, and he doesn't respond well to scolding or harsh corrections. Kind, positive training is the best method for teaching the Cairn.\n" +
                "There is little this smart dog can't learn. With proper training, a Cairn can master an unlimited number of tricks and commands. However, it may be downright impossible to stop a Cairn from doing what Terriers love to do: chase (and dig and bark). The Cairn will chase squirrels, cats, rabbits, and other dogs if given a chance. For this reason, he should only be walked in public places on a leash, and he should be given free run only in a securely fenced yard.\n" +
                "The Cairn actively loves kids and will patiently bear their boisterous ways. Of course, children should not be left alone with dogs of any breed, including the Cairn, and responsible adults should always supervise interactions between kids and dogs.\n" +
                "The Cairn Terrier is a family dog, and he needs to live in the house (or apartment or condo) with his family. He thrives on attention from his loved ones, and he's unhappy if left alone too much. He can become bored at such times, which leads to destructive or annoying behaviors like barking, digging, or chewing.\n" +
                "A Cairn Terrier is a wonderful family companion. He's fun and entertaining, loves to play with kids, and sounds the alarm when visitors approach. He is able to compete in obedience, agility, or Earthdog trials. A Cairn is a great pet for anyone who wants an independent, alert companion with a take-charge attitude toward life.\n" +
                "\n" +

                "\n" +
                "Vital Stats:\n" +
                "Breed Group: Terrier Dogs\n" +
                "Height: 9 inches to 10 inches tall at the shoulder\n" +
                "Weight 13 to 14 pounds\n" +
                "Life Span: 12-15 years\n" +
                "\n" +
                "Health:\n" +
                "Cairns are generally healthy, but like all breeds, they're prone to certain health conditions. Not all Cairns will get any or all of these diseases, but it's important to be aware of them if you're considering this breed.\n" +
                "In Cairns, you should expect to see health clearances from the Orthopedic Foundation for Animals (OFA) for hip dysplasia (with a score of fair or better), elbow dysplasia, hypothyroidism, and von Willebrand's disease; from Auburn University for thrombopathia; and from the Canine Eye Registry Foundation (CERF) certifying that eyes are normal. You can confirm health clearances by checking the OFA web site (offa.org).\n" +
                "\n"+
                "Syndromes that are likely to occur:\n" +
                "Craniomandibular Osteopathy: This affects the skull bones of a growing puppy, causing them to become irregularly enlarged. Symptoms usually appear between four and eight months of age. The cause is unknown but believed to be hereditary. Often the puppy's jaw and glands will become swollen, and he won't be able to open his mouth. He'll drool, have a fluctuating fever that recurs every couple of weeks, and, in some cases, his chewing muscles may atrophy. Anti-inflammatories and pain relievers help the dog deal with what is a painful condition. The irregular bone growth slows and typically stops by the time the puppy becomes a year old. The lesions can regress, but a few dogs have permanent jaw problems and therefore have trouble eating. Occasional cases are severe enough to call for jaw surgery.\n" +
                "Cryptorchidism: Cryptorchidism is the failure of one or both of the testicles to descend into the scrotum. Testicles should descend fully by the time the puppy is two months old. If a testicle is retained, it is usually nonfunctional and can become cancerous if not removed. Treatment is surgical neutering.\n" +
                "Globoid Cell Leukodystrophy: Also known as Krabbe's disease, this is a degenerative disease of the white matter of the brain and spinal cord. Affected puppies die at a very early age or are euthanized. There is now a test available that can identify carriers of this disease. Breeding dogs should be tested.\n" +
                "Hypothyroidism: This is a disorder of the thyroid gland. It's thought to be responsible for conditions such as epilepsy, alopecia (hair loss), obesity, lethargy, hyperpigmentation, pyoderma, and other skin conditions. It is treated with medication and diet.\n" +
                "Legg-Calve-Perthes Disease: This affliction involves the hip joint. If your Cairn has Legg-Perthes, the blood supply to the head of the femur (the large rear leg bone) is decreased, and the head of the femur that connects to the pelvis begins to disintegrate. The first symptoms, limping and atrophy of the leg muscle, usually occur when puppies are four to six months old. Surgery can correct the condition, usually resulting in a pain-free puppy.\n" +
                "Patellar Luxation: Also known as slipped stifles, this is a common problem in small dogs. The patella is the kneecap. Luxation means dislocation of an anatomical part (as a bone at a joint). Patellar luxation is when the knee joint (often of a hind leg) slides in and out of place, causing pain. This can be crippling, although many dogs lead relatively normal lives with this condition.\n" +
                "Ocular Melanosis/Secondary Glaucoma: Formerly called pigmentary glaucoma, this is a fairly recent development in the United States (since 1984). It is a painful inherited condition that occurs primarily in Cairns between seven and 12 years old. The condition generally affects both eyes. Watch both eyes for small spots or patches of very dark pigmentation within the sclera (white part of the eye). The pigment deposits accumulate and decrease ability of fluid to drain out of the anterior chamber. This leads to increased pressure, which is known as secondary glaucoma. If diagnosed early, the condition can be controlled with medication.\n" +
                "Portosystemic Liver Shunt: This is a congenital abnormality in which blood vessels allow blood to bypass the liver. As a result, the blood is not cleansed by the liver as it should be. Surgery is usually the best option.\n" +

                "\n"+
                "Feeding:\n" +
                "Recommended daily amount: 1/2 to 1 cup of high-quality dry food a day, divided into two meals.\n" +
                "Note: How much your adult dog eats depends on his size, age, build, metabolism, and activity level. Dogs are individuals, just like people, and they don't all need the same amount of food. It almost goes without saying that a highly active dog will need more than a couch potato dog. The quality of dog food you buy also makes a difference — the better the dog food, the further it will go toward nourishing your dog and the less of it you'll need to shake into your dog's bowl.\n" +
                "Keep your Cairn in good shape by measuring his food and feeding him twice a day rather than leaving food out all the time. If you're unsure whether he's overweight, give him the eye test and the hands-on test.\n"

        );

        tv.setMovementMethod(new ScrollingMovementMethod());
        tv.setText(info);
    }

}