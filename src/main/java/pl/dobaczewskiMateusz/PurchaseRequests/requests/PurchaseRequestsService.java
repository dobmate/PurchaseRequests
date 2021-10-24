package pl.dobaczewskiMateusz.PurchaseRequests.requests;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PurchaseRequestsService {

    private final PurchaseRequestsRepository purchaseRequestsRepository;

    public void createPR(PurchaseRequests purchaseRequests){
        purchaseRequestsRepository.save(purchaseRequests);
    }

    public Optional<PurchaseRequests> readPR(Long id){
        return purchaseRequestsRepository.findById(id);
    }

    public void updatePR(PurchaseRequests prToUpdate){
        purchaseRequestsRepository.save(prToUpdate);
    }

    public void delPR(Long id){
        Optional<PurchaseRequests> byId = purchaseRequestsRepository.findById(id);
        if(byId.isPresent()){
            purchaseRequestsRepository.deleteById(id);
        }
    }

    public PurchaseRequests findPRbyID (Long id){
        return purchaseRequestsRepository.getById(id);
    }
    public Optional<PurchaseRequests> getPRById(Long id) {
        Optional<PurchaseRequests> byId = purchaseRequestsRepository.findById(id);
        return byId;
    }
    @Transactional
    public void deletePR(Long id){
        PurchaseRequests purchaseRequests = purchaseRequestsRepository.findPRById(id);
        purchaseRequestsRepository.delete(purchaseRequests);
    }

    public List<PurchaseRequests> getPRs(){
        List<PurchaseRequests> prList = purchaseRequestsRepository.findAll();
        return prList;
    }




}
